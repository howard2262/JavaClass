package lab03;

public class 字串相加測試 {

    public static void main(String[] args) {
        // TODO code application logic here

        int a = 100;
        int b = 99;
        String s1 = "java";
        String s2 = s1 + a + b;

        StringBuilder sb = new StringBuilder();
        String s3 = sb.append("java").append(a).append(b).toString();
        
          
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("s2=s3 "+ s2.equals(s3));

    }

}
