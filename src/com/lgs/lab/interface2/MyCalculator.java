package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {

    @Override
    public double devide(double a, double b) {
        return a / b;
    }

    @Override
    public double minus(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double plus(double a, double b) {
        return a + b;
    }


}
