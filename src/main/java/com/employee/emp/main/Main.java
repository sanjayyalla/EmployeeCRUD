package com.employee.emp.main;
import com.employee.emp.controller.EmployeeController;
import com.employee.emp.controller.LoginController;
import com.employee.emp.form.EmployeeDetails;
import com.employee.emp.form.LoginReqForm;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
////        LoginReqForm reqForm = new LoginReqForm();
////        LoginController controller = new LoginController();
////        reqForm.setUsername("sanjay");
////        reqForm.setPassword("sanjayPassword");
////        String res = controller.login(reqForm);
////        System.out.println(res);
//        EmployeeDetails employeeDetails = new EmployeeDetails();
//        EmployeeController employeeController = new EmployeeController();
//        employeeDetails.setId("1");
//        employeeDetails.setDesignation("SDE1");
//        employeeDetails.setName("Sanjay");
//        employeeDetails.setSalary("1000000");
//        employeeDetails.setDateOfBirth("3 Dec 2003");
//        employeeDetails.setDateOfJoining("12 May 2025");
//        employeeController.addEmployee(employeeDetails);
//
//        EmployeeDetails employeeDetails2 = new EmployeeDetails();
//        employeeDetails2.setId("2");
//        employeeDetails2.setDesignation("SDE1");
//        employeeDetails2.setName("Sanjay");
//        employeeDetails2.setSalary("1000000");
//        employeeDetails2.setDateOfBirth("3 Dec 2003");
//        employeeDetails2.setDateOfJoining("12 May 2025");
//        employeeController.addEmployee(employeeDetails2);
//        employeeController.deleteEmployee("1");
//        EmployeeDetails searchedEmployee = employeeController.searchEmployee("2");
//        System.out.println("Got employee : "+searchedEmployee);

//        employeeController.updateEmployee(employeeDetails2);

        Scanner sc = new Scanner(System.in);
        EmployeeController employeeController = new EmployeeController();
        while (true) {
            System.out.println("Enter your choice : 1.Add Employee 2. Search Employee 3. Update Employee 4. Delete Employee 5. Exit");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    EmployeeDetails employeeDetails = new EmployeeDetails();
                    System.out.print("Enter ID: ");
                    employeeDetails.setId(sc.nextInt());
                    System.out.print("Enter Name: ");
                    employeeDetails.setName(sc.next());
                    System.out.print("Enter Designation:");
                    employeeDetails.setDesignation(sc.next());
                    System.out.print("Enter Salary:");
                    employeeDetails.setSalary(sc.nextLong());
                    System.out.print("Enter Date of Joining:");
                    employeeDetails.setDateOfJoining(sc.next());
                    System.out.print("Enter Date of Birth:");
                    employeeDetails.setDateOfBirth(sc.next());
                    employeeController.addEmployee(employeeDetails);
                    break;
                case 2:
                    System.out.println("Enter employee id to search : ");
                    int id = sc.nextInt();
                    EmployeeDetails searchedEmployee = new EmployeeDetails();
                    searchedEmployee = employeeController.searchEmployee(id);
                    if (searchedEmployee != null) {

                        System.out.println("Searched Employee : ");
                        System.out.println(searchedEmployee);
                    } else {
                        System.out.println("User not found");
                    }

                    break;
                case 3:
                    EmployeeDetails employeeDetails1 = new EmployeeDetails();
                    System.out.println("Enter employee id to update : ");
                    employeeDetails1.setId(sc.nextInt());
                    System.out.print("Enter Name: ");
                    employeeDetails1.setName(sc.next());
                    System.out.print("Enter Designation:");
                    employeeDetails1.setDesignation(sc.next());
                    System.out.print("Enter Salary:");
                    employeeDetails1.setSalary(sc.nextLong());
                    System.out.print("Enter Date of Joining:");
                    employeeDetails1.setDateOfJoining(sc.next());
                    System.out.print("Enter Date of Birth:");
                    employeeDetails1.setDateOfBirth(sc.next());
                    employeeController.updateEmployee(employeeDetails1);
                    break;
                case 4:
                    System.out.println("Enter employee Id to delete :");
                    int deleteId = sc.nextInt();
                    employeeController.deleteEmployee(deleteId);
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Enter correct option ");

            }
        }
    }
}
