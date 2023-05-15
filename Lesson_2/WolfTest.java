public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.name = "Боря";
        wolfOne.color = "Серый";
        wolfOne.weight = 62.5f;
        wolfOne.age = 3;
        wolfOne.male = true;
        System.out.println("Волка зовут: " + wolfOne.name);
        System.out.println("Цвет волка: " + wolfOne.color);
        System.out.println("Вес волка: " + wolfOne.weight + " кг");
        System.out.println("Возраст волка: " + wolfOne.age + " лет");
        System.out.println("Пол волка самец: " + wolfOne.male);
        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.voice();
        wolfOne.hunt();
    }
}