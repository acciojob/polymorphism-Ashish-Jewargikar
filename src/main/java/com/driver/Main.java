package com.driver;

public class Main {
  Product p = new Product();
  int result1 = p.product(2, 3);
  int result2 = p.product(2, 3, 4);
  double result3 = p.product(2.5, 3.5);
  System.out.println(result1);
  System.out.println(result2);
  System.out.println(result3);
}
