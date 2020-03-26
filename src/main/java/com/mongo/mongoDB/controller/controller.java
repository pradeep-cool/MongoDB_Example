package com.mongo.mongoDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.mongoDB.Repository.DepartmentRepository;
import com.mongo.mongoDB.model.Department;

@RestController
@RequestMapping(value = "/api")
public class controller {
	
	@Autowired 
	private DepartmentRepository repo;
	
	@PostMapping("/add")
	public Department createDept(@RequestBody Department department) {
		repo.save(department);
		return department;
	}
	
	@GetMapping("/get")
	public List listDepts(){
	    return repo.findAll();
	 }

}
