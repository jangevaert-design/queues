package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

  private String name;
  private List<String> employees = new ArrayList<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name == null || name.isEmpty()) {
      System.out.println("name can't be null");
    } else {
      this.name = name;
    }
  }

  public void addEmployee(String name) {
    if (name == null) {
      System.out.println("null is not accepted for an employee");
    } else {
      employees.add(name);
    }
  }

//  public Company() {}

  public void printSorted() {
    System.out.println("Company name: " + name);
    Collections.sort(employees);
    System.out.println("sorted: " + employees);
  }

}
