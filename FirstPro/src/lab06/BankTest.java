
package lab06;


public class BankTest {

 
    public static void main(String[] args) {
    
    BankArray BA= new BankArray();
    BankATM atm = new BankATM();
    
    BA.display();
    
    BankAccount a1 = BA.getAccount("ACC01");
    BankAccount a2 = BA.getAccount("ACC02");
    
    if (a1!= null&&a2!=null){
    atm.transfer(a1, 500, a2);
    BA.display();
    }
    BankAccount a3=BA.getAccount("ACC03");
    if(a3==null)
            System.out.println(".......Mistake");
            System.out.println("ACC03 doesn't existed");
    }
    
}
