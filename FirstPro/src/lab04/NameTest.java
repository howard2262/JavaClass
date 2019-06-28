package lab04;

public class NameTest {

    public static void main(String[] args) {
        // TODO code application logic here
       NameStudent a =new NameStudent();
       a.firstname="Tom";
       a.lastname="Cruise";
       
       NameStudent b=new NameStudent();
       b.firstname="Anne";
       b.lastname="Hathaway";
               
       NamePrint p=new NamePrint();
       p.print(a);
       p.print(b);
    }

}
