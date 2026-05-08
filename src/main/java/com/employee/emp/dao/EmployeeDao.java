package com.employee.emp.dao;

import com.employee.emp.entity.EmployeeEntity;
import com.employee.emp.form.EmployeeDetails;

public interface EmployeeDao {
    public void addEmployee(EmployeeEntity employeeDetails);
    public EmployeeEntity searchEmployee(int id);
    public void updateEmployee(EmployeeEntity employeeDetails);
    public void deleteEmployee(int id);
}
