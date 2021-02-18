package task2;

import java.util.Scanner;

public class Methods {

    static double a;
    static double b;
    static double result;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введіть два числа щоб розділити перше на друге.");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            result = divide(a, b);
            System.out.println(result);
        } catch (Exception e) {
            System.err.print(" " + e + " ");
            System.out.println();
        }
        try {
            System.out.println("Тепер Введіть два числа щоб відняти від першого друге.");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            result = minus(a, b);
            System.out.println(result);
        } catch (Exception e) {
            System.err.print(" " + e + " ");
            System.out.println();
        }
        try {
            System.out.println("Тепер Введіть два числа щоб додати їх");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            result = plus(a, b);
            System.out.println(result);
        } catch (Exception e) {
            System.err.print(" " + e + " ");
            System.out.println();
        }
        try {
            System.out.println("Тепер Введіть два числа щоб перемножити їх");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            result = multiply(a, b);
            System.out.println(result);
        } catch (Exception e) {
            System.err.print(" " + e + " ");
            System.out.println();
        }
    }

    static void myExceptions() throws IllegalAccessException, MyException {
        if (a < 0 & b < 0) {
            System.err.println("Два числа менше нуля");
            throw new IllegalArgumentException();
        }

        if ((a == 0 & b != 0) | (a != 0 & b == 0)) {
            System.err.println("Одне з заданих чисел дорівнює нулю.");
            throw new ArithmeticException();
        }

        if (a == 0 & b == 0) {
            System.err.println("Два числа дорівнють нулю.");
            throw new IllegalAccessException();
        }

        if (a > 0 & b > 0) {
            System.err.println("Два числа більше нуля.");
            throw new MyException();
        }
    }

    static double divide(double a, double b) throws IllegalAccessException, MyException {
        myExceptions();
        return a / b;
    }

    static double minus(double a, double b) throws MyException, IllegalAccessException {
        myExceptions();
        return a - b;
    }

    static double multiply(double a, double b) throws IllegalAccessException, MyException {
        myExceptions();
        return a * b;
    }

    static double plus(double a, double b) throws IllegalAccessException, MyException {
        myExceptions();
        return a + b;
    }

}
