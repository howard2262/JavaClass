package lab01;


public class 溫度轉換 {


    public static void main(String[] args) {

        double a = 32;
        double b = 80;

        double 攝氏 = a * (9 / 5) + 32;
        double 華氏 = (b - 32) * 5 / 9;

        System.out.println("攝氏" + 攝氏);
        System.out.println("華氏" + 華氏);
    }

}
