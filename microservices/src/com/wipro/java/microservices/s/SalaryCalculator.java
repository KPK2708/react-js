package com.wipro.java.microservices.s;

class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        
    	double baseSalary = employee.getSalary();
        double bonus = baseSalary * 0.10; 
        double tax = baseSalary * 0.05;   
        double otherDeductions = 200;     

        return baseSalary + bonus - tax - otherDeductions;
        
    }
}