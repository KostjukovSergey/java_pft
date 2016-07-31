package ru.stqa.pft.sandbox;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Serj on 24.07.2016.
 */
public class Rectangle {

  public double a;
  public double b;

  public Rectangle (double a, double b)
  {
    this.a=a;
    this.b=b;
  }

  public double area() {
    return this.a * this.b;
  }
}
