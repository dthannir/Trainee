package com.cg.hr.controllers;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.hr.dtos.Employee;
import com.cg.hr.exception.EmpException;
import com.cg.hr.services.EmpService;

@Controller
public class EmpCrudController {

	@Resource
	private EmpService service;
	
	@RequestMapping("/getEmpList.do")
	public ModelAndView getEmpList() throws EmpException{
		List<Employee> empList = service.getEmpList();
		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("empList",empList);
		mAndV.addObject("pageHead","Employee List");
		mAndV.setViewName("EmpList");
		return mAndV;
	}
	
	@RequestMapping("/getEmpDetails.do")
	public ModelAndView getEmpDetails(@RequestParam("empNo") int empNo) throws EmpException{
		Employee emp = service.getEmpOnId(empNo);
		System.out.println(emp);
		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("empDetails",emp);
		mAndV.addObject("pageHead","Employee Details");
		mAndV.setViewName("EmpDetails");
		return mAndV;
	}
	
	@RequestMapping("/getEntryPage.do")
	public ModelAndView getEntryPage(){
		ModelAndView mAndV = new ModelAndView("EntryPage");
		Employee emp  = new Employee(); // Command Object
		mAndV.addObject("employee",emp);
		return mAndV;
	}
	
	@RequestMapping(value="/submitEmpDetails.do",method=RequestMethod.POST)
	public ModelAndView submitEmpDetails(@ModelAttribute("employee")  Employee emp) throws EmpException{
		//System.out.println("Employee details "+ emp);
		service.insertNewEmp(emp);
		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("emp",emp);
		mAndV.addObject("pageHead","Successful Joining of Employee");
		mAndV.setViewName("SuccEmpJoining");
		return mAndV;
	}
	
	// Update Name Use Case
	@RequestMapping("/getUpdateNamePage.do")
	public ModelAndView getUpdateNamePage() throws EmpException{
		ModelAndView mAndV = new ModelAndView("UpdateNamePage");
		List<Integer> idList = service.getEmpNoList();
		mAndV.addObject("idList",idList);
		mAndV.addObject("pageHead","Update Name of an Employee");
		return mAndV;
	}
	
	// Update name
	
	@RequestMapping(value="/submitNewEmpName.do")
	public String submitNewEmpName(@RequestParam() int empNo,
			@RequestParam("") String newName, Model mAndV) throws EmpException{
		//System.out.println("Employee details "+ emp);
		service.updateEmpName(empNo, newName);
		Employee emp = service.getEmpOnId(empNo);
		mAndV.addAttribute("emp",emp);
		mAndV.addAttribute("pageHead","Successful Updation of Employee");
		return "SuccEmpUpdate";
	}
	
}
