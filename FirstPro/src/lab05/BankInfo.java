
package lab05;

public class BankInfo {
    
private long balance=0;
    public String Name;
    public int AccountID;

    public long getBalance() {
        return balance;
    }

    public void Deposit(long Damount) {
        if (Damount > 0) {
            balance = balance + Damount;
        } else {
            return;
        }
    }

    public void Withdrawal(long Wamount) {
        if (Wamount < balance) {
            balance = balance - Wamount;
        } else {
            return;
        }
    }

    public void TransferOutput(long TOamount) {
        if (TOamount <= balance) {
            balance = balance - TOamount;
        } else if (TOamount >= 0) {
            return;
        } else if (TOamount > balance) {
            return;
        }
    }

    public void TransferInput(long TIamount) {
        balance = balance + TIamount;
    }
    
    
    
}
