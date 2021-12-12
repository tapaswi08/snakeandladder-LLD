import java.util.*;
public class Dice {
    private int minValue;
    private int maxValue;
    private int currentValue;



    public int roll() {
        Random rand = new Random();
        return rand.nextInt(0, 6);
    }
    
}
