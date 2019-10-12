package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Enter the first number: ");
            calculator.mathOperation(scan.nextLine());

            System.out.println("Enter the math operation: ");
            calculator.mathOperation(scan.nextLine());

            System.out.println("Enter the second number: ");
            calculator.mathOperation(scan.nextLine());
            scan.nextLine();

            calculator.calculate();

            do {
                System.out.println("Do you want to continue: Yes or No?");
                answer = scan.nextLine();
            } while (!answer.equals("Yes") && !answer.equals("No"));
        } while (answer.equals("Yes"));
    }
}
