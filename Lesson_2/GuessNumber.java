public class GuessNumber {
    private int playerNumber;
    private int player1Number;
    private int hideNumber = 1 + (int) (Math.random() * 100);

    public GuessNumber() {
    }

    public GuessNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public void showHideNumber() {
        System.out.println("hideNumber = " + hideNumber);
    }

    public void showPlayersNumbers() {
        System.out.println("playerNumber = " + playerNumber);
    }

    public void searchNumber() {
    }

    public int getHideNumber() {
        return hideNumber;
    }
}