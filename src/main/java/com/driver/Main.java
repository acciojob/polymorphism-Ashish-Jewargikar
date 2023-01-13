package com.driver;

public class Main
{
    public static class Product{

        public  int product(int a , int b){
            return a*b;
        }
        public  int product(int a , int b, int c){
            return a*b*c;
        }
        public  double product(double a , double b){
            return a*b;
        }
    }
    public static void main(String[] args) {
        Product  p = new Product() ;
        p.product(23,21);
        p.product(52,12,22);
        p.product(1.2,9.1);
    }
}
