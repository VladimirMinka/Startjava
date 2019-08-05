package com.startjava.lesson_2_3.robot;
public class Jaeger {

    private int launched;
    private String mark;
    private String status;
    private String weapon;
    private String bodylanguage;
    private String pilot;
    private float height;
    private float weight;

    public Jaeger(int launched,String mark,String status, String  weapon, String bodylanguage, String pilot,float height, float weight) {
        launched = 2015;
        mark = "Horizon_Brave";
        status = "Destroyed";
        weapon = "Cryo-cannon";
        bodylanguage = "English";
        pilot = "Lo Hin Shen";
        height = 72.54f;
        weight = 7.890f;

        launched = 2018;
        mark = "Bracer Phoenix";
        status = "Destroyed";
        weapon = "Anti-Kaiju";
        bodylanguage = "Mobile Artillery";
        pilot = "Viktoriya Malikova";
        height = 70.91f;
        weight = 2.198f;
    }

    public int getLaunched() {
        return launched;
    }

    public void setLaunched(int launched) {
        this.launched = launched;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getBodylanguage() {
        return bodylanguage;
    }

    public void setBodylanguage(String bodylanguage) {
        this.bodylanguage = bodylanguage;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    void fly() {
        System.out.println("the robot is fly");
    }

    void run() {
        System.out.println("the robot is run");
    }

    void attack() {
        System.out.println("the robot is attack");
    }

    void hunt() {
        System.out.println("the robot is hunt");
    }
}
