package lab04;

import javax.swing.JOptionPane;

public class BankInterface {

    private BankCustomer cust;
    private BankAccount acc;
    private String options;

    public void starting() {
        options = "";
        while (!options.equals("9")) {
            menu();
            runningOption();
        }
    }

    private void menu() {
        String s = "Please enter the number\n"
                + "1. Create a User and Account\n"
                + "2. Select a Account\n"
                + "3. Saving Money\n"
                + "4. taking Money\n"
                + "5. Display account info\n"
                + "9. Finish this program\n";

        do {
            options = JOptionPane.showInputDialog(s);
            if (options == null) {
                JOptionPane.showMessageDialog(null, "Enter 9 to finish this program");
            }
        } while (options == null);
    }

    private void runningOption() {
        switch (options) {
            case "1":
                CreateUser();
                CreateAccount();
                break;
            case "2":
                SelectAccount();
                break;
            case "3":
                savingmoney();
                break;
            case "4":
                takingmoney();
                break;
            case "5":
                displayUserinfo();
                break;
            case "":
                JOptionPane.showMessageDialog(null, "Please Enter the number of options");
                break;
            case "9":
                break;
            default:
                JOptionPane.showMessageDialog(null, "not support yet");
                break;
        }
    }

    private void CreateUser() {
        if (cust == null) {
            cust = new BankCustomer();
            cust.id = 1;
            cust.name = "FundManager";
            JOptionPane.showMessageDialog(null, "Created a User: " + cust.id + " " + cust.name);
        } else {
            JOptionPane.showMessageDialog(null, "USerInfo had been created");
        }
    }

    private void CreateAccount() {
        if (cust.account1 == null) {
            cust.account1 = new BankAccount();
            cust.account1.id = "ACC01";
            cust.account1.balance = 1000;
            JOptionPane.showMessageDialog(null, "Created a Account: " + cust.account1.id + " " + cust.account1.balance);
            acc = cust.account1;
            JOptionPane.showMessageDialog(null, "Operating account: Account 1");
        }
        if (cust.account2 == null) {
            cust.account2 = new BankAccount();
            cust.account2.id = "ACC02";
            cust.account2.balance = 1200;
            JOptionPane.showMessageDialog(null, "Created a Account: " + cust.account2.id + " " + cust.account2.balance);
        }
    }

    private void SelectAccount() {
        if (cust == null) {
            JOptionPane.showMessageDialog(null, "Not created UserInfo yet");
            return;
        }
        String s = "Select a operating account\n"
                + "1. Account1\n"
                + "2. Account2";
        String t = JOptionPane.showInputDialog(s);
        if (t == null) {
            return;
        }
        if (t.equals("1")) {
            acc = cust.account1;
            JOptionPane.showMessageDialog(null, "Operating account1");
        } else if (t.equals("2")) {
            acc = cust.account2;
            JOptionPane.showMessageDialog(null, "Operating account2");
        } else {
            JOptionPane.showMessageDialog(null, "Operating failed");
        }

        /*switch (t) {
            case "1":
                acc = cust.account1;
                JOptionPane.showMessageDialog(null, "Operating account1");
                break;
            case "2":
                acc = cust.account2;
                JOptionPane.showMessageDialog(null, "Operating account2");
                break;
            case "":
                JOptionPane.showMessageDialog(null, "Operating failed");
                break;
           
        }*/
    }

    private void savingmoney() {
        if (cust == null) {
            JOptionPane.showMessageDialog(null, "You haven't created a account");
            return;
        }
        if (acc == cust.account1) {
            JOptionPane.showMessageDialog(null, "You're operateing account1");
        } else if (acc == cust.account2) {
            JOptionPane.showMessageDialog(null, "You're operateing account2");
        }
        String savtex = JOptionPane.showInputDialog("How much do you wnat to save?");
        if (savtex == null) {
            return;
        }
        if (savtex.equals("")) {
            JOptionPane.showMessageDialog(null, "No saving money!");
            return;
        }
        int savnum = Integer.parseInt(savtex);
        if (acc == cust.account1) {

            cust.account1.SavingMoney(savnum);
        } else if (acc == cust.account2) {
            cust.account2.SavingMoney(savnum);
        }

    }

    private void takingmoney() {
        if (cust == null) {
            JOptionPane.showMessageDialog(null, "You haven't created a account");
            return;
        }
        if (acc == cust.account1) {
            JOptionPane.showMessageDialog(null, "You're operateing account1");
        } else if (acc == cust.account2) {
            JOptionPane.showMessageDialog(null, "You're operateing account2");
        }
        String savtex = JOptionPane.showInputDialog("How much do you wnat to take?");
        if (savtex == null) {
            return;
        }
        if (savtex.equals("")) {
            JOptionPane.showMessageDialog(null, "No taking money!");
            return;
        }
        int savnum = Integer.parseInt(savtex);
        if (acc == cust.account1) {
            cust.account1.TakingMoney(savnum);
        } else if (acc == cust.account2) {
            cust.account2.TakingMoney(savnum);
        }
    }

    private void displayUserinfo() {
        if (cust == null) {
            JOptionPane.showMessageDialog(null, "UserInfo hasn't created yet");
            return;
        }
        String s = "ID: " + cust.id + "\n"
                + "Name: " + cust.name + "\n"
                + "Account1: " + cust.account1.id + " Balance " + cust.account1.balance + "\n"
                + "Account2: " + cust.account2.id + " Balance " + cust.account2.balance + "\n";
        JOptionPane.showMessageDialog(null, s);
    }

}
