public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 37;
        if (age > 20) {
            System.out.println("I am more than 20 years old" + "," + " " + "I am" + " " + age + " " + "years");
        }

        boolean isMale = true;
        if (isMale) {
            System.out.println("I am man");
        }

        if (!isMale) {
            System.out.println("I am woman");
        }

        double growth = 1.83;
        if (growth < 1.80) {
            System.out.println("My growth 1.80 м");
        } else {
            System.out.println("My growth more 1.80" + ", " + "My growth" + " " + growth);
        }

        char name = 'V';
        if (name == 'V') {
            System.out.println("My name begins with a letter:" + " " + name);
        } else if (name == 'I') {
            System.out.println("My name begins with a letter:" + name);
        } else {
            System.out.println("My name begins with an unknown letter:" + name);
        }
    }
}
