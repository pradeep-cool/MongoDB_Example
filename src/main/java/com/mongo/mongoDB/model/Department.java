package com.mongo.mongoDB.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Department")
public class Department {

    public List getEmployees() {
		return employees;
	}

	public void setEmployees(List employees) {
		this.employees = employees;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Id
    private String id;

    @Indexed(name = "deptName")
    private String name;
    private String description;

    //@DBRef
    private List employees;
}