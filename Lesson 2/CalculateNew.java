public class CalculateNew {

        private int firstNumber;
        private int secondNumber;
        private char operation;

        public void setFirst(int firstNumber) {
                this.firstNumber = firstNumber;
        }

        public void setSecond(int secondNumber) {
                this.secondNumber = secondNumber;
        }

        public void setOper(char operation) {
                this.operation = operation;
        }

        public void calculate() {
            int result = 0;

            switch (operation) {
                case '+':
                    result = firstNumber + secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
                case '/':
                    result = firstNumber / secondNumber;
                    break;
                case '^':
                    result = 1;
                    for(int i = 0; i < secondNumber; i++) {
                        result *= firstNumber;
                    }
                    break;
                case '%':
                        result = firstNumber % secondNumber;
                    break;
                default:
                    System.out.println("Math operations: '+', '-', '*', '/', '^', '%'");
        }
        System.out.println("Answer = " + result);
    }
}



