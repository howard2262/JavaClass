
import java.util.Arrays;
import javax.swing.JOptionPane;

public class GuessNum {

    public static void main(String[] args) {

        String compNum = "";
        for (int i = 0; i < 4; i++) {
            compNum = compNum + (int) (Math.random() * 10);

        }
        
        String userNum;

        while (true) {
            userNum = JOptionPane.showInputDialog("Please enter four numbers");
            if (userNum.length() < 4 || userNum.length() > 4) {
                System.out.println("Wrong Number: " + userNum);
            }
            if (userNum.length() == 4) {
                break;
            }
        }
        boolean review[] = new boolean[4];
        Arrays.fill(review, false);
        int a = 0, b = 0;

        for (int i = 0; i < 4; i++) {
            if (compNum.charAt(i) == userNum.charAt(i)) {
                a++;
                review[i] = true;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (review[j] == false && compNum.charAt(i) == userNum.charAt(j)) {
                    b++;
                    review[j] = true;
                }

            }

        }
        System.out.println("Your Number: " + userNum);
        System.out.println("Computer Number: " + compNum);
        if (a == 4) {
            System.out.println("Bingo! you are all right~");
        } else {
            System.out.println("Result: "+a + "A" + b + "B");
        }

    }

}
