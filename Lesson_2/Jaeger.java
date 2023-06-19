public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;
    private int armorDamage;
    private int maxAltitude;
    private int maxDepth;

    public Jaeger() {
        modelName = "";
        mark = "";
        origin = "";
        height = 0.0f;
        weight = 0.0f;;
        speed = 0;
        strength = 0;
        armor = 0;
        maxAltitude = 0;
        maxDepth = 0;
    }

    public Jaeger(String modelName, String mark, String origin, float height, float weight, 
            int speed, int strength, int armor, int armorDamage, int maxAltitude, int maxDepth) {
                this.modelName = modelName;
                this.mark = mark;
                this.origin = origin;
                this.height = height;
                this.weight = weight;
                this.speed = speed;
                this.strength = strength;
                this.armor = armor;
                this.armorDamage = armorDamage;
                this.maxAltitude = maxAltitude;
                this.maxDepth = maxDepth;
    }

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

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmorDamage() {
        return armorDamage;
    }

    public void setArmorDamage(int armorDamage) {
        this.armorDamage = armorDamage;
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public int getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(int maxDepth) {
        this.maxDepth = maxDepth;
    }

    public int move() {
        if (speed > 0) {
            System.out.print("Робот " + getModelName() + 
                " находится в движении\nCкорость робота " + getModelName() + ": " + getSpeed());
        }
    return speed;
    }

    public int selfDestruct() {
        if (armor - armorDamage < armor * 0.01) {
            armor-= armorDamage;
            System.out.println("\nРобот " + getModelName() + 
                " Запустил программу самоуничтожения\nБроня робота " + getModelName() + ": " 
                    + getArmor() + " единиц");
        } else if (armor - armorDamage > armor * 0.01){
            armor-= armorDamage;
            System.out.println("\nБроня робота " + getModelName() + ": " + armor + " единиц");
        }
    return armor;
    }
}
