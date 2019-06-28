package lab10;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;

public class DateCheckException {

    public static void main(String[] args) {

        String DateFormat = "yyyy/MM/dd";
        
        SimpleDateFormat sfr = new SimpleDateFormat(DateFormat);
        String sind = JOptionPane.showInputDialog("Enter a format of Date: "+ DateFormat);
        
        try{
        Date d = sfr.parse(sind);
        JOptionPane.showMessageDialog(null, "Date format: " + d.toString());
        } catch(ParseException e) {
        JOptionPane.showMessageDialog(null,"Transform failed: " + DateFormat);
        
        
        }

    }

}
