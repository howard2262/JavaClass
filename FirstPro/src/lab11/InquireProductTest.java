package lab11;

import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class InquireProductTest {

    public static void main(String[] args) {

        InquireProduct p1 = new InquireProduct("A01", "iPhone", 30000);
        InquireProduct p2 = new InquireProduct("A02", "ZenPhone", 20000);
        InquireProduct p3 = new InquireProduct("A03", "OPPO", 10000);

        Map<String, InquireProduct> Phone = new HashMap();
        Phone.put("A01", p1);
        Phone.put("A02", p2);
        Phone.put("A03", p3);

        String inquire;
        while (true) {
            inquire = JOptionPane.showInputDialog("Enter the product ID you want to inquire");
            InquireProduct result = Phone.get(inquire);

            if (result == null) {
                System.out.println("The product ID doesn't exsited");
            } else {
                JOptionPane.showMessageDialog(null, result);
                break;
            }
        }

    }

}
