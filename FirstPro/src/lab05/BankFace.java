
package lab05;

import javax.swing.JOptionPane;

public class BankFace {

 private BankInfo info;
    

    public void setInfo(BankInfo info) {
        this.info = info;
    }
    
    public String ShowMenu (String textM) {
       //傳送String型態回去  取得String型態，名稱為textB的值 
       //使用MVC模式必要的寫法，可以讓值在各個檔案與方法中傳遞與使用
    String textb=JOptionPane.showInputDialog(textM);
    //若訊息型態會取得輸入值，必須在方法中傳送輸入值回去
    return textb;
    }
    
    public String AccOptionS (String textA){
    String texta=JOptionPane.showInputDialog(textA);
    return textA;
    }
            
   public void  ShowMessage (String msg){
   JOptionPane.showMessageDialog(null, msg);
   }


    
}
