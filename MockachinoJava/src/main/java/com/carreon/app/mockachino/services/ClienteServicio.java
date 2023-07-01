package com.carreon.app.mockachino.services;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.swing.JApplet;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carreon.app.mockachino.dao.ClienteDao;
import com.carreon.app.mockachino.dao.SupervisorDao;
import com.carreon.app.mockachino.dto.ida.Clientedto;
import com.carreon.app.mockachino.models.Cliente;

import ch.qos.logback.classic.Logger;
@Service

public class ClienteServicio  implements IService< Clientedto, Clientedto>{
	private static Logger logger = (Logger) LoggerFactory.getLogger(ClienteServicio.class);
	@Autowired
	private ClienteDao clienteDAO;
	
	@Autowired
	private SupervisorDao supervisorDao;

	@Override
	public List<Clientedto> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Clientedto c) {
		// TODO Auto-generated method stub
		clienteDAO.save(this.dtoToModel(c));
		
	}
	
	public Cliente dtoToModel(Clientedto cdto) {
		logger.info(cdto.toString());
		Cliente cliente = new Cliente();
		cliente.setApMaterno(cdto.getApMaterno());
		cliente.setApPaterno(cdto.getApPaterno());
		cliente.setEmail(cdto.getEmail());
		cliente.setEstado(cdto.getEstado());
		cliente.setEstatura(cdto.getEstatura());
		SimpleDateFormat fromUser = new SimpleDateFormat("dd/mm/yyyy");
		SimpleDateFormat myFormat = new SimpleDateFormat("yyy-MM-dd");
		
		java.util.Date time = null;
		Long timeInMilis = 0L;
		try {
			time = fromUser.parse(cdto.getFechNac());
			timeInMilis = time.getTime();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			logger.info("Se obtuvo error al formatear la fecha");
		}
		 
		
		cliente.setFechNac(new java.sql.Date(timeInMilis));
		cliente.setgSanguineo(cdto.getgSanguineo());
		cliente.setId(cdto.getId());
		cliente.setMunicipio(cdto.getMunicipio());
		cliente.setNacionalidad(cdto.getNacionalidad());
		cliente.setNombre(cdto.getNombre());
		cliente.setNumLicencia(cdto.getNumLicencia());
		cliente.setNumPasaporte(cdto.getNumPasaporte());
		cliente.setPais(cdto.getPais());
		cliente.setPeso(cdto.getPeso());
		cliente.setSexo(cdto.getSexo());
		cliente.setEstadoCivil(cdto.getEstadoCivil());
		cliente.setSupervisor(supervisorDao.findById(cdto.getSupervisorId()).get());
		logger.info(cliente.toString());
		return cliente;
	}
	public static Instant getDateFromString(String fecha)
    {
        // Creating an instant object
        Instant timestamp = null;
 
        // Parsing the string to Date
        timestamp = Instant.parse(fecha);
 
        // Returning the converted timestamp
        return timestamp;
    }
}
