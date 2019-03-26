public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 35;
        double growth = 1.83;
        boolean male = true;
        char name = В';
        if(age > 20){
            System.out.println("Мне 20 лет");
        }
        if (male = true) {
            System.out.println("Я мужчина");
            if(male !=true) {
                System.out.println("Я женщина");
            }
        }
        if(growth < 1.80) {
            System.out.println("Мой рост меньше 1.80 м");
        }
        else{
            System.out.println("Мой рост больше 1.80 м");
        }
        if(name =='М'){
            System.out.println("Моё имя начинается не с:" + name);
        }
        else if(name =='И') {
            System.out.println("Моё имя начинается не с:" + name);
        }
        else {
            System.out.println("Моё имя начинается с:" + name);
        }
    }
}
