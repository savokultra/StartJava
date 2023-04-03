public class GuessNumber {

    public static void main(String [] args) {
        //(0, 100] a < x <= b
        int computerNumber = 53;
        int playerNumber = 10;
        while (playerNumber != computerNumber) {
            if (playerNumber <= computerNumber) {
                System.out.println("число " + playerNumber + " меньше того, что загадал компьютер");
                playerNumber++;
            } else if (playerNumber >= computerNumber) {
                System.out.println("число " + playerNumber + " больше того, что загадал компьютер");
                playerNumber--;
            }
        }
        if (playerNumber == computerNumber) {
            System.out.println("Вы победили!");
        }
    }
}