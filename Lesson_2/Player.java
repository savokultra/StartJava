public class Player {
    private String player;
    private int number;
    
    public Player(String player) {
        this.player = player;
    }

    public Player(String player, int number) {
        this.player = player;
        this.number = number;
    }

    public String getPlayer() {
        return player;
    }
}
