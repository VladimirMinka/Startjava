package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private String operation;

    public void mathOperation(String mathExpression) {
        String[] expression = mathExpression.split(" ");
        firstNumber = Integer.parseInt(expression[0]);
        secondNumber = Integer.parseInt(expression[2]);
        operation = expression[1];

    }

    public String calculate() {

        switch (operation) {
            case "+":
                return firstNumber + " " + secondNumber + "=" + (firstNumber + secondNumber);
            case "-":
                return firstNumber + " " + secondNumber + "=" + (firstNumber - secondNumber);
            case "*":
                return firstNumber + " " + secondNumber + "=" + (firstNumber * secondNumber);
            case "/":
                return firstNumber + " " + secondNumber + "=" + (firstNumber / secondNumber);
            case "^":
                return firstNumber + " " + secondNumber + "=" + (int) Math.pow(firstNumber, secondNumber);
            case "%":
                return firstNumber + " " + secondNumber + "=" + (firstNumber % secondNumber);
            default:
                return null;
        }
    }
}
