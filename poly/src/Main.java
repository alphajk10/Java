// Superclass
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    public void calculateSalary() {
        System.out.println(name + "'s Salary: Not Defined");
    }
}

// Subclass Manager
class Manager extends Employee {
    Manager(String name) {
        super(name);
    }

    @Override
    public void calculateSalary() {
        System.out.println(name + "'s Salary: ₹80,000");
    }
}

// Subclass Developer
class Developer extends Employee {
    Developer(String name) {
        super(name);
    }

    @Override
    public void calculateSalary() {
        System.out.println(name + "'s Salary: ₹60,000");
    }
}

// Subclass Intern
class Intern extends Employee {
    Intern(String name) {
        super(name);
    }

    @Override
    public void calculateSalary() {
        System.out.println(name + "'s Salary: ₹15,000");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Employee reference pointing to different subclass objects
        Employee emp;

        emp = new Manager("John");
        emp.calculateSalary();

        emp = new Developer("Alice");
        emp.calculateSalary();

        emp = new Intern("Bob");
        emp.calculateSalary();
    }
}