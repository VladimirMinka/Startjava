public class Game  {
    public static void main(String[] args) {
        int inputnumber = 10;
        int answer = 50;

        while (inputnumber != answer) {
            if(inputnumber > answer)  {
                System.out.println("The number entered by you is more than the fact that thought of the computer");
                inputnumber -= 1;
            } else if (inputnumber < answer) {
                System.out.println("The number entered by you is less than the fact that thought of the computer");
                inputnumber += 1;
            }
        }
        System.out.println("You guessed");
    }
}


