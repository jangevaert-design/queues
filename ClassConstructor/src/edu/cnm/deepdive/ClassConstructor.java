package edu.cnm.deepdive;

class Dog {

  private String color;

  public Dog(String color) {
    System.out.println("constructor");
    this.color = color;
  }

  public void printColor() {
    System.out.println("color = " + color);
  }
}

class Cat {

  private String color;
  private int height;
  private int length;

  public Cat(int length, int theHeight) {
    height = theHeight;
    this.length = length;
    color = "black";
  }

  public void printInfo() {
    System.out.println("length = " + this.length + " height = " + this.height + " color = " + this.color);
  }
}

public class ClassConstructor {

  public static void main(String[] args) {
    Dog dog = new Dog("gray");
    dog.printColor();//if we run this, we see that it calls the constructor first and then the method.

    Cat cat = new Cat(10, 20);
    cat.printInfo();
  }

}
