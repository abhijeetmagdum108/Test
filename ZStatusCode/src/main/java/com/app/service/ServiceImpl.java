package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repository.RepositoryInterface;

@Service
public class ServiceImpl implements ServiceInterface{

	@Autowired
	RepositoryInterface ri;
	
	
	public Student login(int id) {
		Student s=ri.findById(id);
		return s;
	}

}
