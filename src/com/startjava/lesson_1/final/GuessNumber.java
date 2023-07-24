public class GuessNumber {

    public static void main(String[] args) {
        //(0, 100] a < x <= b
        int targetNumber = 53;
        int playerNumber = 51;
        do {
            if (playerNumber > targetNumber) {
                System.out.println("число " + playerNumber + " больше того, что загадал компьютер");
                playerNumber--;
            } else {
                System.out.println("число " + playerNumber + " меньше того, что загадал компьютер");
                playerNumber++;
            }
        } while (playerNumber != targetNumber);
        System.out.println("Загаданное число равно " + playerNumber + " Вы победили!");
    }
}