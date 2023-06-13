import java.util.Scanner;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger flyJaeger = new Jaeger();
        flyJaeger.setModelName("Hawk");
        flyJaeger.setSpeed(20);
        flyJaeger.move();
        System.out.println("ModelName: " + flyJaeger.getModelName());

        SwimmingJaeger shark = new SwimmingJaeger();
        Scanner sc = new Scanner(System.in);
        System.out.println("ModelName = ");
        shark.modelName = sc.nextLine();
        System.out.println("shark.modelName = " + shark.modelName);
    }
}
