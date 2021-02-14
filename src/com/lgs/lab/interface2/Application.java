package com.lgs.lab.interface2;

public class Application {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        double result;

        result = calculator.devide(20.9, 5.0);
        System.out.println("20.9 / 5.0 = " + result);

        result = calculator.minus(259.44, 321.0);
        System.out.println("259.44 -  321.0 = " + result);

        result = calculator.multiply(3, 6);
        System.out.println("3 * 6 = " + (int) result);

        result = calculator.plus(1024, 512);
        System.out.println("1024 + 512 = " + (int) result);


    }
}
