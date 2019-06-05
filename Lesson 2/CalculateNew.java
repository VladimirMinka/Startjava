public class CalculateNew {
        int firstnumber = 2;
        int secondnumber = 10;
        char operation = '^';
        int result;

        public void setFirstnumber(int firstnumber) {
                this.firstnumber = firstnumber;
        }

        public void setSecondnumber(int secondnumber) {
                this.secondnumber = secondnumber;
        }

        public void setOperation(char operation) {
                this.operation = operation;
        }

        public int getResult(int result) {
                return result;

        }

        public void Calculate() {
          switch (operation) {
                    case '+':
                            result = firstnumber + secondnumber;
                            break;
                     case '-':
                            result = firstnumber + secondnumber;
                            break;
                     case '*':
                            result = firstnumber + secondnumber;
                            break;
                     case '/':
                            result = firstnumber + secondnumber;
                            break;
                     case '^':
                            for(int i = 1; i <=secondnumber;i++) {
                                    result *= firstnumber;

                                  }
                                  break;
                     case '%':
                           result = firstnumber + secondnumber;
                           break;
            }
      }
}



