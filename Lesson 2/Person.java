public class Person {

    //public static void main(String[] args) {
    //закоментировал метод т.к программа не работает без объявления данных в методах walk,sit,rus,speak,learn.

    double height = 1.83;
    double weight = 93.0;
    int age = 37;
    String sex = "man";
    String name = "Vladimir";
    // Создайте в классе методы, описывающие поведение (что он может делать) человека:
    //идти, сидеть, бежать, говорить, учить Java

    void walk() {
    System.out.println("name:" + " " + "is" +" " + "walk");
    }

    void sit() {
        System.out.println("name:" + " " + "is" +" " + "sit");
    }

    void run() {
        System.out.println("name:" + " " + "is" +" " + "run");
    }

    void speak() {
        System.out.println("name:" + " " + "is" +" " + "speak");
    }

    void learn() {
        System.out.println("name:" + " " + "is" +" " + "learn");
    }
}



