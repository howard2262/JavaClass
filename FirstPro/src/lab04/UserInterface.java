package lab04;

import javax.swing.*;

public class UserInterface {

    String UserOption;//用文字型態定義變數UserOption
    FireShadow a;//宣告全域變數:Fireshadow file為變數a
    FireShadowda b;//宣告全域變數:Fireshadowda file為變數b
    boolean executive = true;//用布林函數定義 executive為true or flase

    public void displayMenu() { //公開並建立一個不傳回值的方法稱為display
        String menu = "1. Create a role\n"//用文字型態定義變數menu。\n為換行
                + "2. Enter role info\n"
                + "3. Display role info\n"
                + "4. Create DABUWAN\n"
                + "5. Enter DABUWAN amount\n"
                + "6. Display DABUWAN info\n"
                + "7. eat DABUWAN\n"
                + "8. Use Skill\n"
                + "9. Finish this Process";
        UserOption = JOptionPane.showInputDialog(menu);//定義UserOption為輸入之文字的值，並代入menu資訊
    }

    public void createRole() { //公開並建立一個不傳回值的方法稱為createRole
        if (a == null) {//如果a(FireShadow)為空值
            a = new FireShadow();//在FireShadow建立一個空間給a使用
            JOptionPane.showMessageDialog(null, "Establish new role success");
        } else {//如果a(FireShadow)不是空值，出現以下視窗訊息
            JOptionPane.showMessageDialog(null, "You already created a role");
        }
    }

    public void enterInfo() {//公開並建立一個不傳回值的方法稱為enterInfo
        if (a == null) {//如果a(FireShadow)為空值，啟動以下顯示視窗
            JOptionPane.showMessageDialog(null, "You're not established a role yet");
        } else { //若非空值，啟動以下程序
            String s;//用文字型態定義變數s
            s = JOptionPane.showInputDialog("Enter role name");//定義此行為輸入視窗。輸入之文字為s
            a.name = s;//輸入的文字成為a(FireShadow)的變數name
            JOptionPane.showMessageDialog(null, "Role name established");
        }//輸入完成出現的文字訊息
    }

    public void displayInfo() {//公開並建立一個不傳回值的方法稱為displayInfo
        a.display();//呼叫a(FireShadow)檔案中的display方法
    }

    public void CreateDABU() {//公開並建立一個不傳回值的方法稱為CreateDABU
        if (b == null) {//若b為空值，執行以下程序
            b = new FireShadowda();//在b(FireShadowda)建立新空間
            JOptionPane.showMessageDialog(null, "Created DABUWAN success");
        }
    }

    public void toDABU() {//公開並建立一個不傳回值的方法稱為toDABU
        if (b == null) {//若b(FireShadowda)為空值，執行以下程序
            JOptionPane.showMessageDialog(null, "You need to create DABUWAN first");
        } else {//若b(FireShadowda)非空值，執行以下程序
            String s1; //定義s1為文字型態
            s1 = JOptionPane.showInputDialog("Enter DABUWAN amount");//指定此視窗所輸入的值為s1
            int pills = Integer.parseInt(s1);//將s1從文字型態變更為pills整數型態
            b.X = pills;//將b(FireShadowda)中的x變數指定為pills
            JOptionPane.showMessageDialog(null, "filled with DABUWAN");
        }//
    }

    public void DisplayDa() {//公開並建立一個不傳回值的方法稱為DisplayDa
        b.displayDA();//呼叫b(FireShadowda)中的displayDA方法
    }

    public void eatDABU() {//公開並建立一個不傳回值的方法稱為eatDABU
        a.eat(b);//呼叫a(FireShadow)中的eat方法，並代入b(FireShadowda):toDABU所輸入的s1數字
    }

    public void Skill() {//公開並建立一個不傳回值的方法稱為Skill
        a.分身();//呼叫a(FireShadow)中的分身方法

    }

    public void Executive() {//公開並建立一個不傳回值的方法稱為Executive
        if (UserOption.equals("1")) {//若UserOption的文字相等於1
            createRole();//執行createRole方法
        } else if (UserOption.equals("2")) {
            enterInfo();
        } else if (UserOption.equals("3")) {
            displayInfo();
        } else if (UserOption.equals("4")) {
            CreateDABU();
        } else if (UserOption.equals("5")) {
            toDABU();
        } else if (UserOption.equals("6")) {
            DisplayDa();
        } else if (UserOption.equals("7")) {
            eatDABU();
        } else if (UserOption.equals("8")) {
            Skill();
        } else if (UserOption.equals("9")) {//若UserOption的文字相等於9
            executive = false;//變數  executive 變更為 false
        }

        System.out.println("executive: " + executive);

    }

}
