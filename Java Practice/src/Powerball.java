
import java.util.ArrayList;

public class Powerball {

    private ArrayList<Integer> Lottery;

    public Powerball() {

        Lottery = new ArrayList<>();
        for (int i = 0; i < 43; i++) {
            Lottery.add(i);
        }
    }
    public void LotteryNumber() {
        int value = 0;
        for (int i = 0; i < 6; i++) {
            int balls = (int) (Math.random() * Lottery.size() - 1) + 1;
            value = Lottery.remove(balls);
            System.out.println("No." + (i + 1) + " is " + value);
        }
        int Value = (int)(Math.random() * Lottery.size() - 1) + 1;
        System.out.println("The special number is " + Value);
    }

}
