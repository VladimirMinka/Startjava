/*
Выбрал роботов:
Horizon Brave https://pacificrim.fandom.com/wiki/Horizon_Brave и
Bracer Phoenix https://pacificrim.fandom.com/wiki/Bracer_Phoenix
*/
public class Jaeger {

    int launched;
    String mark;
    String status;
    String weapon;
    String bodylanguage;
    String pilot;
    float height;
    float weight;

    public void setLaunched(int launched) {
        this.launched = launched;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setBodylanguage(String bodylanguage) {
        this.bodylanguage = bodylanguage;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public void setHeight(Float height) {
        this.height = height;
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
