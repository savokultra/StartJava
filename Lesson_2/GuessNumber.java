import java.util.Scanner;

public class GuessNumber {
    private Player player;
    private Player player1;
    private int hiddenNumber;

    public GuessNumber(Player player, Player player1) {
        this.player = player;
        this.player1 = player1;
    }

    public void start() {
    generateHiddenNumber();
    Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nПодсказка, искомое число = " + hiddenNumber);
            System.out.println("\nПервый игрок " + player.getName() + " введите число");
            int number = sc.nextInt();
            player.setNumber(number);
            if (player.getNumber() < hiddenNumber) {
                System.out.println("\nЧисло " + player.getNumber() + " меньше загаданного компьютером");
            } else if (player.getNumber() > hiddenNumber) {
                System.out.println("\nЧисло " + player.getNumber() + " больше загаданного компьютером");
            } else {
                System.out.println("\nВы угадали!\nЧисло " + player.getNumber() + " совпадает с" +
                        " загаданным");
                break;
            }
    
            System.out.println("\nВторой игрок " + player1.getName() + " введите число");
            number = sc.nextInt();
            player1.setNumber(number);
            if (player1.getNumber() < hiddenNumber) {
                System.out.println("\nЧисло " + player1.getNumber() + " меньше загаданного компьютером");
            } else if (player1.getNumber() > hiddenNumber) {
                System.out.println("\nЧисло " + player1.getNumber() + " больше загаданного компьютером");
            } else {
                System.out.println("\nВы победили!\nЧисло " + player1.getNumber() + " совпадает с" +
                        " загаданным");
                break;
            }
        } while (true);
    }

    private void generateHiddenNumber() {
        hiddenNumber = 1 + (int) (Math.random() * 100);
    }
}
