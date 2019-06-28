package lab06;

public class BankAccount {

    private String id;
    private int balance;

    public BankAccount(String id, int balance) { // BankAccount為 class
        this.id = id;
        this.balance = balance;
    }

    public void deposit(int Damount) {
        this.balance += Damount;
        System.out.println(id + " Deposit " + balance);
    }
    public void withdraw(int Wamount){
    this.balance-=Wamount;
        System.out.println(id + " Withdraw " + balance);
    }
    public String getID (){
    return id;
    }
    public int getBalance(){
    return balance;
    }
    public String toStirng(){
    return "ID"+id+"\t"+"balance"+balance;
    }
}
