package lab02;

import javax.swing.JOptionPane;

public class student {

    String name;
    int cm;
    int kg;

    public void display() {

        int m;
        m = this.cm/100;

        double bmi;
        bmi = kg /(m*m);

        System.out.print(this.name);
        System.out.print("\t");
        System.out.print(this.cm);
        System.out.print("\t");
        System.out.print(this.kg);
        System.out.print("\t");
        System.out.println(bmi);
        
        
    }
    public void input() {

        String name文字;
        String cm文字;
        String kg文字;

        name文字 = JOptionPane.showInputDialog("請輸入姓名");
        cm文字 = JOptionPane.showInputDialog("請輸入身高cm");
        kg文字 = JOptionPane.showInputDialog("請輸入體重kg");

        this.name = name文字;
        this.cm = Integer.parseInt(cm文字);
        this.kg = Integer.parseInt(kg文字);

    }

}


