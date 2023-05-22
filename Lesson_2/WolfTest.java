public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setName("Боря");
        wolfOne.setColor("Серый");
        wolfOne.setWeight(62.5f);
        wolfOne.setAge(8);
        wolfOne.setMale(true);
        System.out.println("Волка зовут: " + wolfOne.getName());
        System.out.println("Цвет волка: " + wolfOne.getColor());
        System.out.println("Вес волка: " + wolfOne.getWeight() + " кг");
        System.out.println("Возраст волка: " + wolfOne.getAge() + " лет");
        System.out.println("Пол волка самец: " + wolfOne.isMale());
        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}