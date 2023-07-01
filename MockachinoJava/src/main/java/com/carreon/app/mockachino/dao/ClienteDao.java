package com.carreon.app.mockachino.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.carreon.app.mockachino.models.Cliente;
@Repository
public interface ClienteDao extends CrudRepository<Cliente, Long>{

}
