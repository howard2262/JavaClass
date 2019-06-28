
import javax.swing.JOptionPane;
import java.util.Random;

public class TwoArray {

    public static void main(String[] args) {

        int a = 0, b = 0;
        String s1, s2;

        Random rand = new Random();

        do {
            s1 = JOptionPane.showInputDialog("Enter the number of Array column 1~5");
            s2 = JOptionPane.showInputDialog("Enter the number of Array row 1~5");

            try {
                a = Integer.parseInt(s1);
                b = Integer.parseInt(s2);
            } catch (NumberFormatException e) {
                System.out.println("Wrong number format");
            }

        } while (a > 5 || b > 5 || a < 0 || b < 0 || s1 == null || s2 == null);

        int[][] array = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = rand.nextInt(99) + 1;
            }

        }
        if (a == 0 || b == 0) {
            System.out.println("The array of nothing at all");
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Array[" + i + "]" + "[" + j + "] = " + array[i][j]);
            }
        }

    }

}
