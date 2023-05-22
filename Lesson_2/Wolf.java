public class Wolf {

    private String name;
    private String color;
    private float weight;
    private int age;
    private boolean male;

    public void move() {
        System.out.println("Идёт");
    }

    public boolean sit() {
        System.out.println("Сидит");
        return true;
    }

    public void run() {
        System.out.println("Бежит");
    }

    public boolean howl() {
        System.out.println("Воет");
        return true;
    }

    public String hunt() {
        System.out.println("Охотится");
        return "Охотится";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

}


