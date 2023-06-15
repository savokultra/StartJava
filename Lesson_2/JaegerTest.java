import java.util.Scanner;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger flyJaeger = new Jaeger();
        flyJaeger.setModelName("Hawk");
        flyJaeger.setMark("IV");
        flyJaeger.setOrigin("Japan");
        flyJaeger.setHeight(3.2f);
        flyJaeger.setWeight(1.0f);
        flyJaeger.setSpeed(2000);
        flyJaeger.setStrength(5500);
        flyJaeger.setArmor(200);
        System.out.println("flyJaeger ModelName: " + flyJaeger.getModelName());

        Jaeger shark = new Jaeger("Shark", "II", "EU", 8.5f, 2.8f, 40, 12000, 3500);
        System.out.println("shark ModelName: " + shark.getModelName());
        System.out.println(flyJaeger.move());
        System.out.println(shark.move());
    }
}
