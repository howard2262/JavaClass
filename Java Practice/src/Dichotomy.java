
import java.util.Scanner;

public class Dichotomy {

    public static Scanner input = new Scanner(System.in);
    static int time = 0;

    public static void main(String[] args) {

        search();
        time = 0;
        search();
    }

    public static void search() {

        int[] data = {5, 9, 13, 15, 17, 19, 25, 30, 45};
        System.out.println("Enter a data you want to search");
        int target = input.nextInt();
        int ans = binary_search(data, target, data.length);
        if (ans == -1) {
            System.out.println("經過 " + time + " 次的尋找\n" + target + "不在陣列中");
        } else {
            System.out.println("經過 " + time + " 次的尋找\n您要的資料在陣列中的第" + ans + "個位置");
        }
    }

    static int binary_search(int[] data, int target, int max) {
        int middle, left, right;
        left = 0;
        right = max - 1;
        while (left <= right) {
            time++;
            middle = (left + right) / 2;
            System.out.printf("尋找區間: %d(%s)...%d(%s)中間: %d(%s)\n",
                    left, String.valueOf(data[left]),
                    right, String.valueOf(data[right]),
                    middle, String.valueOf(data[middle]));

            if (target == data[middle]) {
                return middle;
            }
            if (target < data[middle]) {
                return middle - 1;
            } else {
                left = middle + 1;

            }

        }
        return -1;
    }

}
