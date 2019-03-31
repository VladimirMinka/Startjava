public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++ ) {
            System.out.println(i);
        }

        int a = 6;
        while(a >=- 6) {
            System.out.println(a);
            a -= 2;
        }

        int numbers = 10;
        int currentNumber = 0;
        do {
            if (numbers % 2 == 1) {
                currentNumber += numbers;
            }
            numbers++;
        } while (numbers <= 20);
        System.out.print(currentNumber);
    }
}
