package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
  //fields
  private double salary;

  //constructors
  public SalariedEmployee() {
  }

  public SalariedEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  //TODO declare and implement a constructor that takes name, hireDate, rate, and hours as parameters
  public SalariedEmployee(String name, LocalDate hireDate, double salary){
    super(name, hireDate);
    setSalary(salary);
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  //TODO Override toString method (control + O)
  @Override
  public String toString() {
   // return super.toString() + " Salary: " +getSalary();
    return String.format("%s, salary=%,.2f", super.toString(),getSalary());
  }
}
