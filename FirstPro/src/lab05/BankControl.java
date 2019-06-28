package lab05;

import javax.swing.JOptionPane;

public class BankControl {

    private BankInfo model;
    private BankInfo customer, customer1, customer2;
    private BankFace view;
    private String options;

    public void ToBeginning() {
        options = "";
        view = new BankFace();
        view.setInfo(model);//設定setInfo可以取得model正在操作的值(balance,name..)
        view.ShowMessage("Well come to JSP Bank, you have to create an account first");
    }

    public boolean Continuing() {
        return !options.equals("9");
    }

    public void Starting() {
        ToBeginning();
        while (Continuing()) {
            DisplayMenu();
            RunningOptions();
        }
    }

    private void DisplayMenu() {
        String menutext = "Please enter a number in below\n"
                + "1. Create an account\n"
                + "2. Select an acocunt you want to operate\n"
                + "3. Saving money to your account\n"
                + "4. Taking money from your account\n"
                + "5. Transfer money to other account \n"
                + "6. Show your account infomation\n"
                + "9. Finish this program";
        options = view.ShowMenu(menutext);
    }

    private void RunningOptions() {
        switch (options) {
            case "1":
                CreateCustomer();
                break;
            case "2":
                SelectAccount();
                break;
            case "3":
                SavingMoney();
                break;
            case "4":
                TakingMoney();
                break;
            case "5":
                TransferMoney();
                break;
            case "6":
                AccountInfo();
                break;
            case "9":
                view.ShowMessage("Thank you for your welcome");
                break;
            default:
                view.ShowMessage("Not suportting");
                break;
        }
    }

    private void CreateCustomer() {
        if (customer == null) {
            customer1 = new BankInfo();
            customer1.AccountID = 001;
            String custName1 = "Your account ID: " + customer1.AccountID + "\n"
                    + "Please Enter your account name in below";
            String newcust1 = view.ShowMenu(custName1);
            if (newcust1.equals("")) {
                view.ShowMessage("Please enter the name of account");
                return;
            }
            String custmoney1 = "How much money do you want to deposit to " + customer1.AccountID;
            String Custmoney1 = view.ShowMenu(custmoney1);
            long CostMoney = Long.parseLong(Custmoney1);
            if (CostMoney < 1000) {
                view.ShowMessage("The saving money need to big than 1000NTD");
                return;
            }
            customer1.Deposit(CostMoney);
            view.ShowMessage("The account created successful!\n" + "\n"
                    + "Account ID: " + customer1.AccountID + "\n"
                    + "Account Name: " + newcust1 + "\n"
                    + "The Balance of Account " + customer1.getBalance());
            customer = customer1;
        } else if (customer == customer1) {
            customer2 = new BankInfo();
            customer2.AccountID = 002;
            String custName2 = "Your account ID: " + customer2.AccountID + "\n"
                    + "Please Enter your account name in below";
            String newcust2 = view.ShowMenu(custName2);
            if (newcust2.equals("")) {
                view.ShowMessage("Please enter the name of account");
                return;
            }
            String custmoney2 = "How much money do you want to deposit to " + customer2.AccountID;
            String Custmoney2 = view.ShowMenu(custmoney2);
            long CostMoney = Long.parseLong(Custmoney2);
            if (CostMoney < 1000) {
                view.ShowMessage("The saving money need to big than 1000NTD");
                return;
            }
            customer2.Deposit(CostMoney);
            view.ShowMessage("The account created successful!\n" + "\n"
                    + "Account ID: " + customer2.AccountID + "\n"
                    + "Account Name: " + newcust2 + "\n"
                    + "The Balance of Account " + customer2.getBalance());
            customer = customer2;
        } else if (customer == customer2) {
            view.ShowMessage("Each person most have two accounts\n"
                    + "if you want create more, please contact us ");
        } else {
            view.ShowMessage("Your account had been created");
        }
    }

    private void SelectAccount() {
        if (customer == null) {
            view.ShowMessage("You need to create an account first");
        } else {
            String accOptions = "Which account you want to operate\n"
                    + "1. Account No.1\n"
                    + "2. Account No.2";
            options = view.ShowMenu(accOptions);
            switch (options) {
                case "1":
                    customer = customer1;
                    view.ShowMessage("You're operating Account No.1 now");
                    break;
                case "2":
                    if (customer2 == null) {
                        view.ShowMessage("You haven't created account 2");
                        return;
                    }
                    customer = customer2;
                    view.ShowMessage("You're operating Account No.2 now");
                    break;
                default:
                    view.ShowMessage("Not supporting");
                    break;
            }
        }
    }

    public void SavingMoney() {
        if (customer == null) {
            view.ShowMessage("You need to create an account first");
        } else if (customer == customer1) {
            String Smoney1 = "How much money do you want to saving to Account No.1?";
            options = view.ShowMenu(Smoney1);
            long smoney1 = Long.parseLong(options);
            customer1.Deposit(smoney1);
            view.ShowMessage("The money you saving this time is " + smoney1 + "\n"
                    + "The balance of Account No.1: " + customer1.getBalance());
        } else if (customer == customer2) {
            String Smoney2 = "How much money do you want to saving to Account No.2?";
            options = view.ShowMenu(Smoney2);
            long smoney2 = Long.parseLong(options);
            customer2.Deposit(smoney2);
            view.ShowMessage("The money you saving this time is " + smoney2 + "\n"
                    + "The balance of Account No.2: " + customer2.getBalance());
        }
    }

    public void TakingMoney() {
        if (customer == null) {
            view.ShowMessage("You need to create an account first");
        } else if (customer == customer1) {
            String Tmoney1 = "How much money do you want to take from Account No.1?";
            options = view.ShowMenu(Tmoney1);
            long tmoney1 = Long.parseLong(options);
            customer1.Withdrawal(tmoney1);
            view.ShowMessage("The money you taking this time is " + tmoney1 + "\n"
                    + "The balance of Account No.1: " + customer1.getBalance());
        } else if (customer == customer2) {
            String Tmoney2 = "How much money do you want to take from Account No.2?";
            options = view.ShowMenu(Tmoney2);
            long tmoney2 = Long.parseLong(options);
            customer2.Withdrawal(tmoney2);
            view.ShowMessage("The money you taking this time is " + tmoney2 + "\n"
                    + "The balance of Account No.2: " + customer2.getBalance());

        }
    }

    public void TransferMoney() {
        if (customer == null) {
            view.ShowMessage("You need to create an account first");

        } else if (customer2 == null) {
            view.ShowMessage("You need to create second account");
        } else if (customer == customer1) {
            String Rmoney1 = "How much money do you want transfer from account No.1 to No.2?";
            options = view.ShowMenu(Rmoney1);
            long rmoney1 = Long.parseLong(options);
            customer1.TransferOutput(rmoney1);
            customer1.TransferInput(rmoney1);
            view.ShowMessage("Your money had been transfer to Account No.2\n"
                    + "Your Balance of Account No.1: " + customer1.getBalance());
        } else if (customer == customer2) {
            String Rmoney2 = "How much money do you want transfer from account No.2 to No.1?";
            options = view.ShowMenu(Rmoney2);
            long rmoney2 = Long.parseLong(options);
            customer2.TransferOutput(rmoney2);
            customer2.TransferInput(rmoney2);
            view.ShowMessage("Your money had been transfer to Account No.2\n"
                    + "Your Balance of Account No.1: " + customer2.getBalance());
        }
    }

    public void AccountInfo() {
        if (customer == null) {
            view.ShowMessage("You need to create an account first");
        } else {
            view.ShowMessage("Your both account information in below\n" + "\n"
                    + "Your Account ID : " + customer1.AccountID + "\n"
                    + "Your Account ID : " + customer2.AccountID + "\n"
                    + "The balance of Account 1 : " + customer1.getBalance() + "\n"
                    + "The balance of Account 2 : " + customer2.getBalance());

        }

    }

}
