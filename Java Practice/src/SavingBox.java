
import javax.swing.JOptionPane;
public class SavingBox {


    public static void main(String[] args) {
       
    String name = JOptionPane.showInputDialog("Please enter the saving box owner");
    System.out.printf("Hi %s, please enter numbers of coin", name);
    String s1=JOptionPane.showInputDialog("Enter a number of 1 coins");
    String s5=JOptionPane.showInputDialog("Enter a number of 5 coins");
    String s10 =JOptionPane.showInputDialog("Please enter a number of 10 coins");
    String s50 =JOptionPane.showInputDialog("Please enter a number of 50 coins");    
    
    int n1 = Integer.parseInt(s1);
    int n5 = Integer.parseInt(s5);
    int n10 = Integer.parseInt(s10);
    int n50 = Integer.parseInt(s50);
    
    int sum, g1, g2, g3, g4 ;
    
    sum= (n1*1)+(n5*5)+(n10*10)+(n50*50);
    
    g1 = sum/1000;
    g2= (sum/100)%5;
    g3= (sum/100)%10;
    g4= sum%10;
    
    System.out.printf("\nThe saving box money: %s thousand %s hundred %s ten %s coins ",g1,g2,g3,g4);
        
        
        
    }
    
}
