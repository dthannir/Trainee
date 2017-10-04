package com.cg.hr.tests;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.hr.dtos.Employee;
import com.cg.hr.exception.EmpException;
import com.cg.hr.services.EmpService;

public class TestLayers {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("EmpManagement.xml");
		EmpService service = ctx.getBean(EmpService.class);
		try {
			List<Employee> empList = service.getEmpList();
			System.out.println(empList);
		} catch (EmpException e) {
			e.printStackTrace();
		}

	}

}
