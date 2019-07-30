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

                System.out.println("Do you want to continue? [Yes/No]");
                answer = scan.nextLine();
                if (!answer.equals("Yes") || !answer.equals("No")) {
                    break;
                } else {
                    System.out.println("Says only Yes or No!");
                }
            } while (!answer.equals("Yes") && !answer.equals("No"));
        } while (answer.equals("Yes"));
    }
}
