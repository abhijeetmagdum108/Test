package com.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Student;

@Repository
public interface RepositoryInterface extends CrudRepository<Student, Integer>{
	
	public Student findById(int id);

}
