public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 37;
        double growth = 1.83;
        boolean male = true;
        char name = 'В';

        if (age > 20) {
            System.out.println("Мне больше 20 лет" + "," +  " "+ "Мне" + " " + age + " " + " лет");
        }

        if (male) {
            System.out.println("Я мужчина");
        }

        if (!male) {
            System.out.println("Я женщина");
        }

        if (growth < 1.80) {
            System.out.println("Мой рост 1.80 м");
        } else {
            System.out.println("Мой рост больше 1.80" + ", " + "мой рост" + " " + growth);
        }
		
        if (name == 'В') {
            System.out.println("Моё имя начинается с буквы:"+ " " + name);
	} else if (name == 'И') {
            System.out.println("Моё имя начинается  с буквы:" + name);
        } else {
            System.out.println("Моё имя начинается с неизвестной буквы:" + name);
		}
    }
}
