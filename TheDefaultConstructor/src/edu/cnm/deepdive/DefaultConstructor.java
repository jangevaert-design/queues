package edu.cnm.deepdive;

public class DefaultConstructor {

  public static void main(String[] args) {

    Dog dog = new Dog();//creating a new Dog instance by calling the constructor Dog() in the dog
    //class but this class does not have a constructor. Default constructor with no arguments  and
    // an empty body has been created. When you compile this code and then look in the out folder
    // for the compiled Dog.class, you will find the default constructor.
  }

}
