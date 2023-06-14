import java.util.Scanner;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger flyJaeger = new Jaeger();
        flyJaeger.setModelName("Hawk");
        flyJaeger.setMark("IV");
        flyJaeger.setOrigin("Japan");
        flyJaeger.setHeight(3.2f);
        flyJaeger.setWeight(1.0f);
        flyJaeger.setSpeed(20);
        flyJaeger.setStrength(5500);
        flyJaeger.setArmor(200);

        SwimmingJaeger shark = new SwimmingJaeger();
        shark.modelName = "Shark";
        //Scanner sc = new Scanner(System.in);
        //System.out.println("ModelName = ");
        //String modelName = sc.nextLine();
        //shark.setModelName(modelName);
        /*System.out.println("Mark = ");
        shark.mark = sc.nextLine();
        System.out.println("Origin = ");
        shark.origin = sc.nextLine();
        System.out.println("Height (format 0.0) = ");
        shark.height = sc.nextFloat();
        System.out.println("Weight (format 0.0) = ");
        shark.weight = sc.nextFloat();
        System.out.println("Speed (format 0) = ");
        shark.speed = sc.nextInt();
        System.out.println("Strength (format 0) = ");
        shark.strength = sc.nextInt();
        System.out.println("Armor (format 0) = ");
        shark.armor = sc.nextInt();*/
    }
}
