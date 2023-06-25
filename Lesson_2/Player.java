public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
        GuessNumber player = new GuessNumber(name);
    }

    public String getName() {
        return name;
    }
}