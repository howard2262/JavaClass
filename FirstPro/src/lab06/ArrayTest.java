package lab06;

public class ArrayTest {

    public static void main(String[] args) {

        int[] a = {50, 30, 60, 90};
        int[] b = {30, 80, 100, 40};
        int total = 0;
        System.out.println("The Length " + a.length);
        System.out.println("The Length " + b.length);

        for (int j = 0; j < a.length; j++) //不加分號;
        {
            total += a[j];
        }

        for (int i = 0; i < b.length; i++) //不加分號;
        {
            total += b[i];
        }
        System.out.println("The total: " + total);
    }

}
