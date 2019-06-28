package lab04;

import javax.swing.JOptionPane;

public class BankAccount {

    String id;
    long balance;

    public void SavingMoney(int amount) {
        if (amount < 0) {
            JOptionPane.showMessageDialog(null, "Failed, the money have to big than zero ");
            return;
        }
        balance = balance + amount;
        JOptionPane.showMessageDialog(null, "Successful Deposit!");
    }

    public void TakingMoney(int amount) {
        if (amount > balance) {
            JOptionPane.showMessageDialog(null, "Insufficient Deposit");
        }
        JOptionPane.showMessageDialog(null, "Successful Withdrawal!");
        balance = balance - amount;
    }
}
