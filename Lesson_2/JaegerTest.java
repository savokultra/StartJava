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
        flyJaeger.setArmorDamage(199);
        flyJaeger.setMaxAltitude(18000);
        flyJaeger.weaponSelect();
        flyJaeger.move();
        flyJaeger.selfDestruct();
        System.out.println("\n");
        Jaeger shark = new Jaeger("Shark", "II", "EU", 8.5f, 2.8f, 40, 12000, 3500, 453, 0, 1000);
        shark.weaponSelect();
        shark.move();
        shark.selfDestruct();
    }
}
