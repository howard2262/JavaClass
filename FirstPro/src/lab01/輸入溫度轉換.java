package lab01;


import javax.swing.JOptionPane;

public class 輸入溫度轉換 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String temperature;
        temperature = JOptionPane.showInputDialog("請輸入攝氏溫度");

        double a;
        a = Double.parseDouble(temperature);

        System.out.println("華氏溫度為" + ((a * (9 / 5) + 32)));

    }

}
