package edu.cnm.deepdive;

class Example {
  private String name = "dog";

  {
    System.out.println(name);
  }

  private static int COUNT = 0;

  static {
    System.out.println(COUNT);
  }

  {
    COUNT += 10;
    System.out.println(COUNT);
  }

  public Example() {
    System.out.println("Constructor");
  }
}

class Demo {

  static {
    add(2);
  }
  static void add(int number) {
    System.out.print(number + " ");
  }

  Demo() {
    add(5);
  }

  static {
    add(4);
  }

  {
    add(6);
  }

  static {
    new Demo();
  }

  {
    add(8);
  }
}

public class OrderOfInitialization {

  public static void main(String[] args) {
      Example example = new Example();//prints 0 - dog - 10 - Constructor.
    //first static, then instance variables (both in the order they appear, lastly constructor.
    new Demo();
  }

}
