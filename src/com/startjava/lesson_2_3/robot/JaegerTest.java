package com.startjava.lesson_2_3.robot;
public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerFirst = new Jaeger(2015, "Horizon Brave", "Destroyed", "Cryo-cannon", "English", "Lo Hin Shen", 72.54f, 7.890f);

        jaegerFirst.getLaunched();
        jaegerFirst.getMark();
        jaegerFirst.getStatus();
        jaegerFirst.getWeapon();
        jaegerFirst.getBodylanguage();
        jaegerFirst.getPilot();
        jaegerFirst.getHeight();
        jaegerFirst.getWeight();

        Jaeger jaegerSecond = new Jaeger(2018, "Bracer Phoenix", "destroyed", "Anti-Kaiju", "Mobile Artillery", "Viktoriya Malikova", 70.91f, 2.198f);

        jaegerSecond.getLaunched();
        jaegerSecond.getMark();
        jaegerSecond.getStatus();
        jaegerSecond.getWeapon();
        jaegerSecond.getBodylanguage();
        jaegerSecond.getPilot();
        jaegerSecond.getHeight();
        jaegerSecond.getWeight();
    }
}
