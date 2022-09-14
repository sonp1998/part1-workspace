package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
  //fields
  private double rate;
  private double hours;
  //constructors
  public HourlyEmployee() {
  }
  public HourlyEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }
  //4 arg constructor
  public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
    super(name, hireDate);
    setRate(rate);
    setHours(hours);
  }

  public void pay() {
    System.out.printf("%s is paid hourly, for a total of %,.2f%n", getName(), getHours() * getRate());
  }
  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public double getHours() {
    return hours;
  }

  public void setHours(double hours) {
    this.hours = hours;
  }
  //%.2f is for the decimal of a float
  @Override
  public String toString() {
//    return super.toString() + ", rate= " + rate + "Hours= " + hours;
    return String.format("%s, rate=%.2f, hours=%.1f", super.toString(), getRate(), getHours());
//    return super.toString() + ", Rate= " + rate + "Hours= " + hours;
  }
}
