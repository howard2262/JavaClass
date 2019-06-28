package lab01;


public class 時間轉換 {


    public static void main(String[] args) {
        // TODO code application logic here

        int age = 26;
        int days = age * 365;
        int hrs = days * 24;
        int mins = hrs * 60;
        int secs = mins * 60;
        long millis = secs * 1000L;

        System.out.println(days + "天");
        System.out.println(hrs + "小時");
        System.out.println(mins + "分鐘");
        System.out.println(secs + "秒");
        System.out.println(millis + "毫秒");
    }

}
