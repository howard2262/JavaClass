
package Practice01;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.text.ParseException;
public class dateCheckException {


    public static void main(String[] args) {
       
        String date="yyyy/MM/dd";
        SimpleDateFormat dateX = new SimpleDateFormat(date);
        
        String dateText=JOptionPane.showInputDialog("Enter a date"+"\nFormat: "+date);
        
        try{
        Date dateFormat = dateX.parse(dateText);
            System.out.println(dateFormat);
        
        } catch(ParseException e){
            System.out.println("Wrong Format of Date: " +dateText);
        }
    }
    
}
