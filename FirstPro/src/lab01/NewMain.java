package lab01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String name;
        name = JOptionPane.showInputDialog("請輸入名字");
        
        String Egrade;
        Egrade = JOptionPane.showInputDialog("請輸入英文成績");
        
        String Cgrade;
        Cgrade = JOptionPane.showInputDialog("請輸入中文成績");
        
        int g;
        g = Integer.parseInt(Egrade);
        
        int h;
        h = Integer.parseInt(Cgrade);
        
        System.out.println(name);
        System.out.println("英文成績" + Egrade);
        System.out.println("中文成績" + Cgrade);
        System.out.println("總分" + (g + h));
        
        System.out.println("-------------------------------------------");
        
        String high;
        high = JOptionPane.showInputDialog("請輸入身高");
        
        double d;
        d = Double.parseDouble(high);
        System.out.println("您的身高為" + d);
        
        System.out.println("-------------------------------------------");
        
        byte a = 1;
        byte b = 3;
        byte c = (byte) (a + b);
        System.out.println(c);
        
        System.out.println("-------------------------------------------");
        
        float f;
        int i;
        f = 3.14F;
        i = (int) f;
        System.out.println(i);
        System.out.println("-------------------------------------------");
        
        System.out.println(5 / 3);
        System.out.println(5 % 3);
        System.out.println(5.0D / 3);
        System.out.println(5.0F / 3);
        System.out.println("-------------------------------------------");
        
        int z = 0x41;
        System.out.println(z);
        
        char s = 'A';
        System.out.println(s);
        
        char y = 0x2600;
        System.out.println(y);
        System.out.println("-------------------------------------------");
        
    }
    
}
