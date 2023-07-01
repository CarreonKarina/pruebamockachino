package com.carreon.app.mockachino.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.carreon.app.mockachino.models.Supervisor;
@Repository
public interface SupervisorDao extends CrudRepository<Supervisor, Long>{

}
