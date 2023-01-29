import java.util.Scanner;

//import java.nio.charset.Charset;

public class MyFirstApp {   
    public static void main(String[] args) {
        System.out.println("Написано однажды, работает везде");
        Scanner console = new Scanner (System.in, "cp866");
        System.out.print("Введите свое имя: ");
        System.out.print(console.nextLine());
        System.out.print(" - Так вас зовут ");
        System.out.print("Изменил коммит в в ветке main");
        System.out.print("Урок 12");
    //public static void main(String[] args) {
        //System.out.println(Charset.defaultCharset().displayName());
    }
}