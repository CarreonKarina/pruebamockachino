package com.carreon.app.mockachino.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carreon.app.mockachino.dao.SupervisorDao;
import com.carreon.app.mockachino.dto.vuelta.SupervisorDTO;
import com.carreon.app.mockachino.models.Supervisor;


@Service
public class SupervisorService implements IService<SupervisorDTO, Supervisor>{
	
	@Autowired
	private SupervisorDao supervisorDAO;
	
	Logger logger = LoggerFactory.getLogger(SupervisorService.class);

	@Override
	public List<SupervisorDTO> listar() {
		logger.info("En listar ");
		// TODO Auto-generated method stub
		List<SupervisorDTO> listSup = new ArrayList<>();
		//List<Supervisor> lisS= new ArrayList<>();
		Iterable<Supervisor> findAll = supervisorDAO.findAll();
		
		for(Supervisor s : findAll )
		  listSup.add(this.modelToDto(s));
		  logger.info(listSup.toString());
		return listSup;
	}

	@Override
	public void guardar(Supervisor t) {
		// TODO Auto-generated method stub
		
	}
	
	public SupervisorDTO modelToDto(Supervisor s) {
		SupervisorDTO sdto  = new SupervisorDTO();
		sdto.setId(s.getId());
		sdto.setDepartamento(s.getDepartamento());
		sdto.setNombre(s.getNombre()+" "+ s.getApPaterno()+" " +s.getApMaterno());
		return sdto;
	}

}
