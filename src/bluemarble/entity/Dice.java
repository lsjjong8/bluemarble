package bluemarble.entity;

public class Dice {

    private static int first;
    private static int second;

    public static int rollDice() {
        first = (int)(Math.random() * 6)+ 1;
        second = (int)(Math.random() * 6)+ 1;

        return first + second;
    }
}
