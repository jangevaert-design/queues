package edu.cnm.deepdive;

/*
1. The first statement of every constructor is to call to another constructor within the same class
using this() or to call to a parent class constructor using super().
2.if super() is not declared in a constructor the compiler will insert a no argument super() call
as the first statement in that constructor.
3. the super() call can't be used after the first statement of the constructor.
4.if the parent class does not have a no-argument constructor and the child class does not define
any constructors, the compiler will show an error when it tries to insert a default no-arguments
constructor in the child class.
5.if the parent class does not have a no-argument constructor, the compiler requires an explicit call
to a parent constructor in each child class.




 */

public class Main {

  public static void main(String[] args) {
      Husky husky = new Husky(5);//prints Animal - Dog - Husky
    //1. rule #1 of initialization: super classes are initialized first!!
    //2. with this() we are calling (or chaining) a constructor with different parameters in the same class while with
    //super() we are calling the constructor in the super class.
    //3. when a class has a super class with a no argument constructor, that subclass will inject or
    //insert the super() call to the constructor of the super class.
    husky.printDetails();
    System.out.println();
    Dog dog = new Dog(3);
    dog.setName("Rex");
//    dog.printDetails(); is not possible because it is a method of the husky subclass. For that reason
//    we have moved the printDetails() method from the Husky class to the Animal class because all
//    subclasses will inherit this method. Also note that we used getName() and getAge() getters in
//    the husky class because the fields name and age are private in the Animal super class but now
//    that we have moved the printDetails() method to the Animal class we can use 'name' and 'age'
//    since these private fields are accessible within the same class.
    System.out.println();
    dog.printDetails();
    System.out.println();
    Cat cat = new Cat(3);

  }

}
