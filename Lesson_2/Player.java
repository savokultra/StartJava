public class Player {
    private String name;
    private int number;
    
    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }
}
