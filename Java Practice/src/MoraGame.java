
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class MoraGame {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        String[] hands = {"Scissors", "Stone", "Paper"};
        Random r = new Random();
        int comp = r.nextInt(3);

        int user = 0;
        System.out.print("Mora Game ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("(%d)%s", i, hands[i]);
            System.out.print(" : ");
        }
        try {
            user = stdIn.nextInt();
            String msg = null;

            msg = "You posed " + hands[user] + ", Computer posed " + hands[comp] + " . ";

            System.out.println(msg);

            if (user == comp) {
                System.out.println("Flat");
            } else if (user == 0 && comp == 1 || user == 1 && comp == 2 || user == 2 && comp == 0) {
                System.out.println("You Lost");
            } else {
                System.out.println("You Win");
            }
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Wrong number: " + e);

        }
    }

}
