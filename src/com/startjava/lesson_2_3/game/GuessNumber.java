package com.startjava.lesson_2_3.game;
import java.util.Scanner;

public class GuessNumber {

    Scanner scan = new Scanner(System.in);
    private int numbers;
    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        numbers = (int) (Math.random() * 101);
    }

    public void startGame() {
        System.out.println("   ");
        System.out.println("Start");

        do {
            System.out.println(firstPlayer.getName() + " your number:");
            firstPlayer.setNumber(scan.nextInt());

            if (firstPlayer.getNumber() == numbers) {
                System.out.println(firstPlayer.getName() + " " + "You win");
                break;
            } else if (firstPlayer.getNumber() > numbers) {
                System.out.println("Number must be less");
            } else if (firstPlayer.getNumber() < numbers) {
                System.out.println("Number must be more");
            }

            System.out.println(secondPlayer.getName() + " your number:");
            secondPlayer.setNumber(scan.nextInt());

            if (secondPlayer.getNumber() == numbers) {
                System.out.println(firstPlayer.getName() + "You win");
                break;
            } else if (secondPlayer.getNumber() > numbers) {
                System.out.println("Number must be less");
            } else if (secondPlayer.getNumber() < numbers) {
                System.out.println("Number must be more");
            }
        } while (true);
    }
}
