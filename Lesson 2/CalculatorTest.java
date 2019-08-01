import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Enter the first number: ");
            calculator.setFirstNumber(scan.nextInt());

            System.out.println("Enter the math operation: ");
            calculator.setOperation(scan.next().charAt(0));

            System.out.println("Enter the second number: ");
            calculator.setSecondNumber(scan.nextInt());
            scan.nextLine();

            calculator.calculate();

            do {
                System.out.println("Do you want to continue: Yes or No?");
                answer = scan.nextLine();
            } while (!answer.equals("Yes") && !answer.equals("No"));
        } while (answer.equals("Yes"));
    }
}
