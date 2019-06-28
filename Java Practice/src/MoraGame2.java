
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MoraGame2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] mora = {"Scissors", "Stone", "Paper"};
        Random r = new Random();
        int comp = r.nextInt(3);
        int user = 0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("(%d)%s ", i, mora[i]);
            System.out.print(" : ");

        }
        try {
            user = input.nextInt();
            String msg = "You posed " + mora[user] + ", Computer posed " + mora[comp];
            System.out.println(msg);
            if (user == comp) {
                System.out.println("Flat");
            } else if (user == 0 && comp == 1 || user == 1 && comp == 2 || user == 2 && comp == 0) {
                System.out.println("You Lose");

            } else {
                System.out.println("You Win");
            }
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Wrong Number: " + e);

        }

    }
}
