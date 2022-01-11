package com.java.Employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.Employee.entity.EmpEntity;
import com.java.Employee.repository.EmpRepo;

@Service
public class EmpService {

	@Autowired
	EmpRepo  emprepo;
	public EmpEntity findEmployeeById(long id) {
		 return emprepo.findEmployeeById(id);
	}
	public EmpEntity findEmployeeByEmpId(long empid) {
		return emprepo.findEmployeeByEmpId(empid);
	}
	public EmpEntity findAllEmployeeById(long id) {

		return emprepo.findAllEmployeeById(id);
	}

}
