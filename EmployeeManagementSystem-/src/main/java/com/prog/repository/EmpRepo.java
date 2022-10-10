package com.prog.repository;

import com.prog.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer>
{

	//S save(Employee e);

}
