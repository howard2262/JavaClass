package lab01;


import javax.swing.JOptionPane;

public class 輸入BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String height, weight;
        height = JOptionPane.showInputDialog("請輸入身高(CM)");
        weight = JOptionPane.showInputDialog("請輸入體重(KG)");

        double a;
        a = Double.parseDouble(height);
        a = a / 100;
        double b;
        b = Double.parseDouble(weight);

        System.out.println("您的BMI為" + (b / (a * a)));

    }

}
