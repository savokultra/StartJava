public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    private float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    private float getWeight() {
        return height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    private int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    private int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    int move() {
        if (speed > 0) {
        System.out.println("Робот находится в движении\nCкорость робота " + getSpeed());
        }
    return speed; 
    }
}
