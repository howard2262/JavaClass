
package lab04;
import javax.swing.JOptionPane;
public class UserInterfaceTest {

 
    public static void main(String[] args) {

    UserInterface UI =new UserInterface();//在UserInterface插入一個新的變數UI
    while (UI.executive){// 用迴圈指令 命令UI執行executive變數，若為Ture進行迴圈
    UI.displayMenu();//用UI呼叫UserInterfac檔案中的displayMenu方法
    UI.Executive();//用UI呼叫UserInterfac檔案中的Executive方法
    }
    JOptionPane.showMessageDialog(null, "Finished");//迴圈結束所出現的視窗訊息
    }  
}
