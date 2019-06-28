
import java.util.Scanner;

public class ifJudgement {

    public static void main(String[] args) {

        System.out.println("Please enter the number your phone case: ");
        Scanner staIn = new Scanner(System.in);
        int price = staIn.nextInt();

        System.out.println(price == 499 ? "Condition Establish " + price : "Condition doesn't Establish " + price);

    }

}
