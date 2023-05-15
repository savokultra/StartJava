public class Wolf {

    String name;
    String color;
    float weight;
    int age;
    boolean male;

    void move() {
        System.out.println("Идёт");
    }

    boolean sit() {
        System.out.println("Сидит");
        return true;
    }

    void run() {
        System.out.println("Бежит");
    }

    boolean voice() {
        System.out.println("Воет");
        return true;
    }

    String hunt() {
        System.out.println("Охотится");
        return "Охотится";
    }
}


