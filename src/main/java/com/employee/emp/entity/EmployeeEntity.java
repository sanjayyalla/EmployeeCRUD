package com.employee.emp.entity;

public class EmployeeEntity {
    String name;
    String designation;
    int id;
    long salary;
    String dateOfJoining;
    String dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", id='" + id + '\'' +
                ", salary='" + salary + '\'' +
                ", dateOfJoining='" + dateOfJoining + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
