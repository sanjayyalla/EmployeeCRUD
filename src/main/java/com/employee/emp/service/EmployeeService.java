package com.employee.emp.service;

import com.employee.emp.form.EmployeeDetails;

public interface EmployeeService {
    public void addEmployee(EmployeeDetails employeeDetails);
    public EmployeeDetails searchEmployee(int id);
    public void updateEmployee(EmployeeDetails employeeDetails);
    public void deleteEmployee(int id);
}
