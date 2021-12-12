public class Player {
    private String name;
    private int position;
    private boolean won;
    public Player(String name){
        this.name = name;
        this.won = false;

    }
    public int getPosition() {
        return position;
    }
    public void setPosition(int position2) {
        position = position2;
    }
    public void setWon(boolean b) {
        won = true;
    }
    public String getName() {
        return name;
    }
    
}
