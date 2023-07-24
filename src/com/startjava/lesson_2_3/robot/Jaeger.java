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

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(float height) {
        this.height = height;
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

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setArmorDamage(int armorDamage) {
        this.armorDamage = armorDamage;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public void setMaxDepth(int maxDepth) {
        this.maxDepth = maxDepth;
    }

    public int move() {
        if (speed > 0 && maxAltitude > 0) {
            System.out.print("Робот " + modelName + 
                    " находится в движении\nCкорость робота " + modelName + ": " + speed +
                    " км/ч");
        } else if (speed > 0 && maxDepth > 0) {
            System.out.print("Робот " + modelName + 
                    " находится в движении\nCкорость робота " + modelName + ": " + speed +
                    " узлов");
        }
        return speed;
    }

    public int armorAnalysis() {
        if (armor - armorDamage < armor * 0.01) {
            armor-= armorDamage;
            System.out.println("\nРобот " + modelName + 
                    " Запустил программу самоуничтожения\nБроня робота " + modelName + ": " 
                    + armor + " единиц(a)");
        } else if (armor - armorDamage > armor * 0.01) {
            armor-= armorDamage;
            System.out.println("\nБроня робота " + modelName + ": " + armor + " единиц(a) робот" +
                    " боеспособен");
        }
        return armor;
    }

    public void selectWeapon() {
        if (maxAltitude > 0) {
            System.out.println("Применяется оружие воздушного боя");
        } else {
            System.out.println("Применяется оружие подводного боя");
        }
    }
}
