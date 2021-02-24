package edu.cnm.deepdive;

public class Person {

  private String firstName;
  private String lastName;

  public Person() {
    this("Eric", "Barker");//calling the second constructor with the this() method.
  }

  public Person(String firstName, String last) {
    this.firstName = firstName;
    lastName = last;//can be typed with or without this. because the parameter is different than the
    //field.
  }

  public static void main(String[] args) {

  }

}
