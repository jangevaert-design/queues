package edu.cnm.deepdive;

class Dog {

  private String name;
  private String breed;
  private double weight;

  public Dog(String name) {
//    this.name = name;
//    breed = "husky";
//    weight = 30.0;
//    with this() we can call the other constructors.
      this(name, "Husky");//if you decide to use this(), it has to be the first code in the constructor.
    System.out.println("constructor 1");
  }

  public Dog(String name, String breed) {
//    this.name = name;
//    this.breed = breed;
//    weight = 25.0;
    this(name, breed, 25.0);
    System.out.println("constructor 2");
  }

  public Dog(String name, String breed, double weight) {
    this.name = name;
    this.breed = breed;
    this.weight = weight;
    System.out.println("constructor 3");
  }

  public void print() {
    System.out.println("name: " + name + "; breed: " + breed + "; weight: " + weight);
  }
}

public class OverloadingConstructors {

  public static void main(String[] args) {
    Dog dog1 = new Dog("Jimmy");
    dog1.print();
    System.out.println();
    Dog dog2 = new Dog("Rex", "German shepherd");
    dog2.print();
    System.out.println();
    Dog dog3 = new Dog("Akira", "Australian shepherd", 22);
    dog3.print();


  }
}
