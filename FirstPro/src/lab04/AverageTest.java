
package lab04;


public class AverageTest {

    public static void main(String[] args) {
        
    NameStudent a = new NameStudent();
    a.firstname="Andrew";
    a.lastname="Pan";
    a.eng=77;
    a.math=63;
    
    NameStudent b= new NameStudent();
    b.firstname="Peter";
    b.lastname="Chen";
    b.eng=89;
    b.math=72;
    
    
    Average c= new Average();
    c.title="English Total score ";
    c.add(a.eng);
    c.add(b.eng);
    
    Average d = new Average();
    c.title="Math Total score ";
    d.add(a.math);
    d.add(b.math);
    
    Average e =new Average();
    e.title="English total average ";
    e.add(a.eng);
    e.add(b.eng);
    
    Average f =new Average();
    f.title="Math total average ";
    f.add(a.math);
    f.add(b.math);
    
    AveragePrint p = new AveragePrint();
    p.fullname(a);
    p.fullname(b);
    p.printTotal(c);
    p.printTotal(d);
    p.PrintAvg(e);
    p.PrintAvg(f);
    
        
        
    }
    
}
