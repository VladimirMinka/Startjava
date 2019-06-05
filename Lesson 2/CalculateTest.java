/*
реализуйте дополнительный класс CalculatorTest
для проверки знака математической операции воспользуйтесь оператором switch
формат ввода математического выражения:
Введите первое число: 2
Введите знак математической операции: ^
Введите второе число: 10
*/
import java.util.Scanner;
public class CalculateTest {

        public static void main(String[] args) {
                CalculateNew calculate = new CalculateNew();
                Scanner scan = new Scanner(System.in);
                String answer = "yes";

                do {
                        System.out.print("Enter the first number: ");
                        calculate.setFirstnumber(scan.nextInt());
                        System.out.print("Enter the math operation: ");
                        calculate.setOperation(scan.next().charAt(0));
                        System.out.print("Enter the first number: ");
                        calculate.setSecondnumber(scan.nextInt());
                            do {
                                    System.out.println("Do you want to continue: Yes or No ?");
                                    answer = scan.next();
                                    if(answer != "Yes" || answer != "No") {
                                        System.out.println("Enter Yes or No");
                                    }
                            } while (answer == "Yes"|| answer =="No");
                } while (answer.equals("Yes"));
        }
}












