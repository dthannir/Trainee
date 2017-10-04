package com.cg.hr.daos;

import java.util.List;

import com.cg.hr.dtos.Employee;
import com.cg.hr.exception.EmpException;

public interface EmpDao {
	
	public List<Employee> getEmpList() throws EmpException;
	public Employee getEmpOnId(int empNo) throws EmpException;
	public void insertNewEmp(Employee emp) throws EmpException;
	public void updateEmpName(int empNo, String empNm) throws EmpException;
	public  List<Integer> getEmpNoList() throws EmpException;
}
