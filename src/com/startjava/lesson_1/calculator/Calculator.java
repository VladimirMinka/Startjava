package com.startjava.lesson_1;
public class Calculator {
    public static void main(String[] args) {
        int a = 50;
        int b = 60;
        char operation = '*';
        int result = 0;

        if (a > 0 && b > 0) {
            if (operation == '+') {
                result = a + b;
            } else if (operation == '-') {
                result = a - b;
            } else if (operation == '*') {
                result = a * b;
            } else if (operation == '/') {
                result = a / b;
            } else if (operation == '^') {
                result = a;
                int i = b;
                while (i > 1) {
                    result *= a;
                    i--;
                }
            } else if (operation == '%') {
                result = a % b;
            }
            System.out.println("Result is equal:" + " " + result);
        } else {
            System.out.println("The calculator works only with positive integers");
        }
    }
}
