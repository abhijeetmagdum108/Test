package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.service.ServiceImpl;

@RestController
public class HomeController {
	@Autowired
	ServiceImpl si;

	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET, produces = "application/json")
	public Student login(@PathVariable int id, HttpServletResponse response) {
		Student s = si.login(id);

		if (s != null) {
			response.setStatus(HttpServletResponse.SC_FOUND);
			return s;
		} else {
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
		}

		return null;
	}
}
