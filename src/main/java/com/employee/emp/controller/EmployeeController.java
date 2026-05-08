package com.employee.emp.controller;

import com.employee.emp.form.EmployeeDetails;
import com.employee.emp.service.EmployeeService;
import com.employee.emp.service.impl.EmployeeServiceImpl;

public class EmployeeController {
    EmployeeService service = new EmployeeServiceImpl();
    public void addEmployee(EmployeeDetails employeeDetails)
    {
        if(employeeDetails!=null)
        {
            service.addEmployee(employeeDetails);
        }
    }
    public EmployeeDetails searchEmployee(int id)
    {
        EmployeeDetails searchedEmployee = new EmployeeDetails();
        if(id!=0)
        {
            searchedEmployee = service.searchEmployee(id);
            return searchedEmployee;
        }
        return null;
    }
    public void updateEmployee(EmployeeDetails employeeDetails)
    {
        if(employeeDetails!=null)
        {
            service.updateEmployee(employeeDetails);
        }
    }
    public void deleteEmployee(int id)
    {
        if(id!=0)
        {
            service.deleteEmployee(id);
        }
    }
}
