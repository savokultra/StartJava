public class Player {
    private String name;
    private int number;

    public Player() {
    }

    public Player(int number) {
        this.number = number;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNumber() {
        GuessNumber playerNumber = new GuessNumber(number);
    }
}