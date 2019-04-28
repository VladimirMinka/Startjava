    //создайте объект типа Wolf
    //присвойте в нем полям экземпляра класса Wolf какие-то значения
    //считайте эти значения из полей и отобразите в консоли
    //вызовите методы объекта
class WolfTest {

public static void main(String[] args) {


        Wolf wolf = new Wolf();
        wolf.gender = "man";
        wolf.name = "Shaitan";
        wolf.weight = 30.5;
        wolf.age = 5;
        wolf.color = "grey";

        System.out.println(wolf.gender);
        System.out.println(wolf.name);
        System.out.println(wolf.weight);
        System.out.println(wolf.age);
        System.out.println(wolf.color);

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}


