public class Player {
    private String playerName;
    private int playerNumber;

    public Player() {
    }

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public Player(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getName() {
        return playerName;
    }
}