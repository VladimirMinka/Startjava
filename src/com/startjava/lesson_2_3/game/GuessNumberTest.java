package com.startjava.lesson_2_3.game;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = null;

        do {
            System.out.println("Enter FirstPlayer names : ");
            Player firstPlayer = new Player(scan.nextLine());

            System.out.println("Enter SecondPlayer names : ");
            Player secondPlayer = new Player(scan.nextLine());
            GuessNumber guess = new GuessNumber(firstPlayer, secondPlayer);

            guess.startGame();

            do {
                System.out.println("Do you want to continue: Yes or No?");
                answer = scan.nextLine();
            } while (!answer.equals("Yes") && !answer.equals("No"));
        } while (answer.equals("Yes"));
    }
}
