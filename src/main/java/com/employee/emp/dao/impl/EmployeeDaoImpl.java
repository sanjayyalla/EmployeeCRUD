//The below is using List
//package com.employee.emp.dao.impl;
//import com.employee.emp.dao.EmployeeDao;
//import com.employee.emp.entity.EmployeeEntity;
//import com.employee.emp.form.EmployeeDetails;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class EmployeeDaoImpl implements EmployeeDao {
//
//    List<EmployeeEntity> employeeDetailsList = new ArrayList<>();
//
//    @Override
//    public void addEmployee(EmployeeEntity employeeDetails) {
//        employeeDetailsList.add(employeeDetails);
/// /        System.out.println("Hello");
//        System.out.println(employeeDetailsList);
//    }
//
//    @Override
//    public EmployeeEntity searchEmployee(int id) {
//        for (EmployeeEntity employeeEntity : employeeDetailsList) {
//            if (employeeEntity.getId()==id) {
//                return employeeEntity;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public void updateEmployee(EmployeeEntity employeeDetails) {
//        for (EmployeeEntity employeeEntity : employeeDetailsList) {
//            if (employeeEntity.getId()==employeeDetails.getId()) {
/// /                if (employeeDetails.getId() != null && !employeeDetails.getId().isEmpty()) {
/// /                    employeeEntity.setId(employeeDetails.getId());
/// /                }
//                if (employeeDetails.getName() != null && !employeeDetails.getName().isEmpty()) {
//                    employeeEntity.setName(employeeDetails.getName());
//                }
//                if (employeeDetails.getDesignation() != null && !employeeDetails.getDesignation().isEmpty()) {
//                    employeeEntity.setDesignation(employeeDetails.getDesignation());
//                }
//                if (employeeDetails.getSalary() != null && !employeeDetails.getSalary().isEmpty()) {
//                    employeeEntity.setSalary(employeeDetails.getSalary());
//                }
//                if (employeeDetails.getDateOfBirth() != null && !employeeDetails.getDateOfBirth().isEmpty()) {
//                    employeeEntity.setDateOfBirth(employeeDetails.getDateOfBirth());
//                }
////                if (employeeDetails.getDateOfJoining() != null && !employeeDetails.getDateOfJoining().isEmpty()) {
////                    employeeEntity.setId(employeeDetails.getDateOfJoining());
////                }
//
//                System.out.println("Updated employee : "+employeeEntity);
//                break;
//
//            }
//        }
//
//    }
//
//    @Override
//    public void deleteEmployee(int id) {
//        for (int i = 0; i < employeeDetailsList.size(); i++) {
//            EmployeeEntity employeeEntity = employeeDetailsList.get(i);
//            if (employeeEntity.getId()==id) {
//                employeeDetailsList.remove(i);
//                System.out.println("Employee deleted with ID: " + id);
//                System.out.println(employeeEntity);
//                return;
//            }
//        }
//        System.out.println("Employee with ID: " + id + " not found.");
//    }
//}


//The below is using Map

//The below is using List
package com.employee.emp.dao.impl;

import com.employee.emp.dao.EmployeeDao;
import com.employee.emp.entity.EmployeeEntity;

import java.util.HashMap;
import java.util.Map;


public class EmployeeDaoImpl implements EmployeeDao {

    Map<Integer, EmployeeEntity> employeeDetailsList = new HashMap<>();

    @Override
    public void addEmployee(EmployeeEntity employeeDetails) {
        employeeDetailsList.put(employeeDetails.getId(), employeeDetails);
    }

    @Override
    public EmployeeEntity searchEmployee(int id) {
        return employeeDetailsList.get(id);
    }

    @Override
    public void updateEmployee(EmployeeEntity employeeDetails) {
        EmployeeEntity existing = employeeDetailsList.get(employeeDetails.getId());
        if (existing != null) {
            if (employeeDetails.getName() != null && !employeeDetails.getName().isEmpty()) {
                existing.setName(employeeDetails.getName());
            }
            if (employeeDetails.getDesignation() != null && !employeeDetails.getDesignation().isEmpty()) {
                existing.setDesignation(employeeDetails.getDesignation());
            }
            if (employeeDetails.getSalary() != 0) {
                existing.setSalary(employeeDetails.getSalary());
            }
            if (employeeDetails.getDateOfBirth() != null && !employeeDetails.getDateOfBirth().isEmpty()) {
                existing.setDateOfBirth(employeeDetails.getDateOfBirth());
            }
            if (employeeDetails.getDateOfJoining() != null && !employeeDetails.getDateOfJoining().isEmpty()) {
                existing.setDateOfJoining(employeeDetails.getDateOfJoining());
            }
            System.out.println("Updated employee: " + existing);
        } else {
            System.out.println("Employee not found with id : " + employeeDetails.getId());
        }


    }

    @Override
    public void deleteEmployee(int id) {
        EmployeeEntity removed = employeeDetailsList.remove(id);
        if (removed != null) {
            System.out.println("Employee deleted with ID: " + id);
            System.out.println(removed);
        } else {
            System.out.println("Employee with ID: " + id + " not found.");
        }
    }
}

