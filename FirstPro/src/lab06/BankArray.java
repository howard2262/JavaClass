
package lab06;

public class BankArray {
 
    private BankAccount[] accounts; //BankAccount為class，宣告此class為陣列
    
    public BankArray(){
    accounts= new BankAccount[2];
    accounts[0]=new BankAccount("ACC01",1000);
    accounts[1]=new BankAccount("ACC02",1000);
     }
    public BankAccount getAccount (String findID){
    //傳回值可以是類別(Class)，BankAccount為記憶體位置，告知此方法傳回account至這個位置    
        for (int i = 0; i < accounts.length; i++) {
            BankAccount account = accounts[i];
           //型別BankAccount，account為accounts的讀取結果  
            String objID=account.getID();
            if (objID.equals(findID)){
            return account;
            }
        }
           return null;
    }
    
    public void display(){
        System.out.println("---------------");
        for (int i = 0; i < accounts.length; i++) {
        BankAccount account=accounts[i];
            System.out.println(account.toStirng());                
        }
    }
}
