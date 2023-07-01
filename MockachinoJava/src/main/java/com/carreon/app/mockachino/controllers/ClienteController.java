package com.carreon.app.mockachino.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carreon.app.mockachino.dto.ida.Clientedto;

import com.carreon.app.mockachino.services.IService;


@RestController
@RequestMapping("micro/cliente")
@CrossOrigin(origins = "*")
public class ClienteController {
	
	@Autowired
	IService<Clientedto, Clientedto> clienteService;
	
	@PostMapping
	public Map<String, String>guardar(@RequestBody Clientedto c){
		clienteService.guardar(c);
		Map<String, String> respuesta = new HashMap<>();
		respuesta.put("msg","Cliente guardado correctamente");
		return respuesta;
	}

}
