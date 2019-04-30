    //создайте объект типа Wolf
    //присвойте в нем полям экземпляра класса Wolf какие-то значения
    //считайте эти значения из полей и отобразите в консоли
    //вызовите методы объекта
class WolfTestNew {

public static void main(String[] args) {

        WolfNew wolf = new WolfNew();
        wolf.setGender("man");
        wolf.setName("Bim");
        wolf.setWeight(30);
        wolf.setAge(10);
        wolf.setColor("grey");

        System.out.println(wolf.getGender());
        System.out.println(wolf.getName());
        System.out.println(wolf.getWeight());
        System.out.println(wolf.getAge());
        System.out.println(wolf.getColor());

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}


