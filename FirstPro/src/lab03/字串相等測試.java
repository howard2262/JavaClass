package lab03;

public class 字串相等測試 {

    public static void main(String[] args) {
        // TODO code application logic here

        String a = "java";
        String b = "java";

        System.out.println("a==b " + (a == b));

        String c = new String("java");
        System.out.println("a==c " + (a == c));

        System.out.println("a.equals(c) " + a.equals(c));
    



    }

}
