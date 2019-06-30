/*
Выбрал роботов:
Horizon Brave https://pacificrim.fandom.com/wiki/Horizon_Brave и
Bracer Phoenix https://pacificrim.fandom.com/wiki/Bracer_Phoenix
*/
public class Jaeger {

    private int launched;
    private String mark;
    private String status;
    private String weapon;
    private String bodylanguage;
    private String pilot;
    private float height;
    private float weight;

    public int getLaunched() {
        return  launched;
    }

    public void setLaunched(int launched) {
        this.launched = launched;
    }

    public String getMark() {
        return  mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getStatus() {
        return  status;
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
