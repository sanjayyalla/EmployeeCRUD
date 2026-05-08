package com.employee.emp.service.impl;

import com.employee.emp.dao.EmployeeDao;
import com.employee.emp.dao.impl.EmployeeDaoImpl;
import com.employee.emp.entity.EmployeeEntity;
import com.employee.emp.form.EmployeeDetails;
import com.employee.emp.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeDao employeeDao = new EmployeeDaoImpl();

    @Override
    public void addEmployee(EmployeeDetails employeeDetails) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setDesignation(employeeDetails.getDesignation());
        employeeEntity.setId(employeeDetails.getId());
        employeeEntity.setName(employeeDetails.getName());
        employeeEntity.setSalary(employeeDetails.getSalary());
        employeeEntity.setDateOfBirth(employeeDetails.getDateOfBirth());
        employeeEntity.setDateOfJoining(employeeDetails.getDateOfJoining());
        employeeDao.addEmployee(employeeEntity);
    }

    @Override
    public EmployeeDetails searchEmployee(int id) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setId(id);
        EmployeeEntity searchedEmployee = employeeDao.searchEmployee(employeeEntity.getId());
        EmployeeDetails employeeDetails = new EmployeeDetails();
        if(searchedEmployee!=null) {
            employeeDetails.setId(searchedEmployee.getId());
            employeeDetails.setName(searchedEmployee.getName());
            employeeDetails.setDesignation(searchedEmployee.getDesignation());
            employeeDetails.setSalary(searchedEmployee.getSalary());
            employeeDetails.setDateOfBirth(searchedEmployee.getDateOfBirth());
            employeeDetails.setDateOfJoining(searchedEmployee.getDateOfJoining());
            return employeeDetails;
        }
        return  null;
    }

    @Override
    public void updateEmployee(EmployeeDetails employeeDetails) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setDesignation(employeeDetails.getDesignation());
        employeeEntity.setId(employeeDetails.getId());
        employeeEntity.setName(employeeDetails.getName());
        employeeEntity.setSalary(employeeDetails.getSalary());
        employeeEntity.setDateOfBirth(employeeDetails.getDateOfBirth());
        employeeEntity.setDateOfJoining(employeeDetails.getDateOfJoining());
        employeeDao.updateEmployee(employeeEntity);
    }

    @Override
    public void deleteEmployee(int id) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setId(id);
        employeeDao.deleteEmployee(employeeEntity.getId());

    }
}
