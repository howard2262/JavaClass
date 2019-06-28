
import javax.swing.JOptionPane;

public class Practice1 {
//define class
    
    public static void main(String[] args) {
// define main method        
// TODO code application logic here
        String name, eg, mg;

        name = JOptionPane.showInputDialog("Please leave your neme");
        eg = JOptionPane.showInputDialog("Please enter your English grade");
        mg = JOptionPane.showInputDialog("Please enter your math grade");

        double e = Double.parseDouble(eg);
        double m = Double.parseDouble(mg);
        double total = e + m;
        double avg = total / 2D;

        System.out.println("Hello " + name);
        System.out.println("Your total of this grade " + total);
        System.out.println("Your average of this grade " + avg);

    }

}
