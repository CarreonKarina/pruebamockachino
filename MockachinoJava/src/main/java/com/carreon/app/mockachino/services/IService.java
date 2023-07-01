package com.carreon.app.mockachino.services;

import java.util.List;

public interface IService <T, S>{
	List<T> listar();
	void guardar(S t);
	
	

}
