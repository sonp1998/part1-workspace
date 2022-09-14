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

  public SalariedEmployee(String name, LocalDate hireDate, double salary){
    super(name, hireDate);
    setSalary(salary);
  }

  public void pay() {
//    System.out.println(getName()+ " is paid a salary of " + getSalary());
    System.out.printf("%s is paid a salary of %,.2f%n", getName(), getSalary());
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
   // return super.toString() + ", salary= " +getSalary();
    return String.format("%s, salary=%,.2f", super.toString(),getSalary());
  }
}
