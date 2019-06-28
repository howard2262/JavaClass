package lab04;

public class CalculatorTest {
    
    public static void main(String[] args) {
    
   NameStudent a= new NameStudent();
   a.firstname="Tom";
   a.lastname="Cruise";
   a.eng=95;
   a.math=72;
   
   NameStudent b=new NameStudent();
   b.firstname="Anna";
   b.lastname="Margent";
   b.eng=83;
   b.math=66;
   
   Calculator c = new Calculator();
   c.title="English Score";
   c.add(a.eng);
   c.add(b.eng);
   
   Calculator d = new Calculator();
   d.title = "Math Score";
   d.add(a.math);
   d.add(b.math);
   
   CalculatorPrint p = new CalculatorPrint();
   p.printer(a);
   p.printer(b);
   p.printtotal(c);
   p.printtotal(d);
        
    }
    
}
