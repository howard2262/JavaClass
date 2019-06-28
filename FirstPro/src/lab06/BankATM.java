package lab06;

public class BankATM {
    
    public void transfer(BankAccount acc1, int amount, BankAccount acc2) {
        
        System.out.println("-----Transfer------");
        acc1.withdraw(amount);
        acc2.deposit(amount);
        
    }    
    
}
