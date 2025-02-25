package com.ems;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void showEmployeeDetails() {
        for (Employee e : employees) {
            System.out.println("Employee Name: " + e.getClass().getSimpleName());
            e.work();
            System.out.println("Salary: " + e.getSalary());
            System.out.println("---------------------");
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        Manager manager = new Manager("Alice", 80000);
        Developer developer = new Developer("Bob", 60000);
        SecurityGuard securityGuard = new SecurityGuard("Charlie", 35000);

        system.addEmployee(manager);
        system.addEmployee(developer);
        system.addEmployee(securityGuard);

        system.showEmployeeDetails();
    }
}
