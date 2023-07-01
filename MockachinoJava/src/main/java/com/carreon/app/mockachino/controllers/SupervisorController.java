package com.carreon.app.mockachino.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.carreon.app.mockachino.dto.vuelta.SupervisorDTO;

import com.carreon.app.mockachino.models.Supervisor;
import com.carreon.app.mockachino.services.IService;



@RestController
@RequestMapping("micro/supervisor")
@CrossOrigin(origins = "*")
public class SupervisorController {
	Logger logger = LoggerFactory.getLogger(SupervisorController.class);
	
	@Autowired
	IService<SupervisorDTO, Supervisor> supervisorService;
	
	
	@GetMapping
	public List<SupervisorDTO>listar(){
		logger.info(supervisorService.listar().toString());
		return supervisorService.listar();
	}

}
