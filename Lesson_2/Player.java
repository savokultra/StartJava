public class Player {
    private String name;
    private int number;
    
    public Player() {
        name = "unkown";
        number = -1;
    }
    
    public Player(String name) {
        this.name = name;
    }

    public String getPlayer() {
        return name;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
}
