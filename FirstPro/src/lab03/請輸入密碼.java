package lab03;

import javax.swing.JOptionPane;

public class 請輸入密碼 {

    public static void main(String[] args) {
        // TODO code application logic here

        String a = JOptionPane.showInputDialog("請輸入密碼");
        String b = JOptionPane.showInputDialog("請確認密碼");

        System.out.println("密碼為 " + a);
        System.out.println("確認密碼為 " + b);
        
        if (a == b) 
            System.out.println("位址正確");
         else 
            System.out.println("位址錯誤");
        

        if (a.equals(b)) 
            System.out.println("內容正確");
         else 
            System.out.println("內容錯誤");
        }
   

    }    


