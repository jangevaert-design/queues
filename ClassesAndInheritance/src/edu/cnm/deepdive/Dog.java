package edu.cnm.deepdive;

public class Dog extends Animal{

    public Dog(int age) {
    super(age);
    System.out.println("Dog");

  }
}
/*
since we have changed the no argument constructor in the Animal class to a constructor with one
parameter, we get a compilation error in the dog constructor.
This can be solved by accepting the parameter 'int age' in the dog constructor and adding 'age' to
the constructor call we make to the Animal constructor through 'super(age)'.
When doing this we also need to take care of the constructor in Husky.
 */