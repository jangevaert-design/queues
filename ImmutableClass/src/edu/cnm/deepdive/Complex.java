package edu.cnm.deepdive;

public class Complex {

  private final double real;
  private final double imaginary;

  public Complex(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  public double getReal() {
    return real;
  }

  public double getImaginary() {
    return imaginary;
  }

  public Complex plus(Complex b) {
    double newReal = this.real + b.real;
    double newImaginary = this.imaginary + b.imaginary;
    return new Complex(newReal, newImaginary);
  }

  public Complex minus(Complex a) {
    double newReal = real - a.real;
    double newImaginary = imaginary - a.imaginary;
    return new Complex(newReal, newImaginary);
  }

}
