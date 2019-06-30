public class JaegerTest {

public static void main(String[] args) {
    Jaeger jaegerFirst = new Jaeger();

        jaegerFirst.setLaunched(2015);
        jaegerFirst.setMark("Mark-1");
        jaegerFirst.setStatus("Destroyed");
        jaegerFirst.setWeapon("Cryo-cannon");
        jaegerFirst.setBodylanguage("English");
        jaegerFirst.setPilot("Lo Hin Shen");
        jaegerFirst.setHeight(72.54f);
        jaegerFirst.setWeight(7.890f);

        System.out.println(jaegerFirst.getLaunched());

        Jaeger jaegerSecond = new Jaeger();

        jaegerSecond.setLaunched(2018);
        jaegerSecond.setMark("Mark-5");
        jaegerSecond.setStatus("Destroyed");
        jaegerSecond.setWeapon("Anti-Kaiju");
        jaegerSecond.setBodylanguage("Mobile Artillery");
        jaegerSecond.setPilot("Viktoriya Malikova");
        jaegerSecond.setHeight(70.91f);
        jaegerSecond.setWeight(2.198f);

        System.out.println(jaegerSecond.getMark());
    }
}
