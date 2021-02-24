package edu.cnm.deepdive;

public class Animal {

  private int age;
  private String name;//we use protected here which means available in the same package and in
  //child classes of other packages.

  public Animal(int age) {
    System.out.println("Animal");
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void printDetails() {
    System.out.println("name: " + name + " age: " + age);
  }
}
