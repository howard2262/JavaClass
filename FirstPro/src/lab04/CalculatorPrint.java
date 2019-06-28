package lab04;

public class CalculatorPrint {

public void printer (NameStudent x){
String s= x.fullname() +"\t"+ x.eng +"\t"+x.math;
    System.out.println(s);
}
public void printtotal(Calculator cal){
String s1=cal.title+"\t"+cal.total;
    System.out.println(s1);
    
    
    
}
 
}
