public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
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


