public class Player {
    private String name;
    private int number;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(int number) {
        this.number = number;
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
}