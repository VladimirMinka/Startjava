package com.startjava.lesson_1;
public class MyFirstGame {
    public static void main(String[] args) {
        int inputNumber = 10;
        int answer = 50;

        while (inputNumber != answer) {
            if(inputNumber > answer)  {
                System.out.println("The number entered by you is more than the fact that thought of the computer");
                inputNumber -= 1;
            } else if (inputNumber < answer) {
                System.out.println("The number entered by you is less than the fact that thought of the computer");
                inputNumber += 1;
            }
        System.out.println("You guessed");
    }
}
}
