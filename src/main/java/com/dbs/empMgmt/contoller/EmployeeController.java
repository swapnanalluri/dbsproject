package com.dbs.empMgmt.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dbs.empMgmt.model.Employee;
import com.dbs.empMgmt.service.EmployeeService;

@Component
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    public Employee saveEmployee(Employee employee){
        return this.employeeService.saveEmployee(employee);
    }

    public List<Employee> listAll(){
        return this.employeeService.listAll();
    }

    public Employee findById(long empId){
        return this.employeeService.findById(empId);
    }

    void deleteEmployee(long empId){
        this.employeeService.deleteEmployee(empId);
    }
}
