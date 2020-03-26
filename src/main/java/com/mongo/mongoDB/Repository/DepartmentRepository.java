package com.mongo.mongoDB.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mongo.mongoDB.model.Department;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {

    @Query(value = "{'employees.name': ?0}", fields = "{'employees' : 0}")
    Department findDepartmentByEmployeeName(String empName);

    List findDepartmentByName(String name);
}