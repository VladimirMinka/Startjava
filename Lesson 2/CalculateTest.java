import java.util.Scanner;
public class CalculateTest {

        public static void main(String[] args) {
                CalculateNew calculator = new CalculateNew();
                Scanner scan = new Scanner(System.in);
                String answer = null;

                do {
                        System.out.print("Enter the first number: ");
                        calculator.setFirst(scan.nextInt());

                        System.out.print("Enter the math operation: ");
                        calculator.setOper(scan.next().charAt(0));

                        System.out.print("Enter the first number: ");
                        calculator.setSecond(scan.nextInt());
                        scan.nextLine();
                        calculator.calculate();

                            do {
                                    System.out.println("Do you want to continue: Yes or No ?");
                                    answer = scan.nextLine();
                                    if(answer != "Yes" | answer != "No") {
                                        System.out.println("Enter Yes or No");
                                    }
                            } while (answer == "Yes"|| answer =="No");
                } while (answer.equals("Yes"));
        }
}












