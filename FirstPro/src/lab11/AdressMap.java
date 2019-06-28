
package lab11;

import javax.swing.JOptionPane;
import java.util.Map;
import java.util.HashMap;
public class AdressMap {

    public static void main(String[] args) {
      
        Map<String,Integer> m = new HashMap<>();
        m.put("Bill", 92);
        m.put("Jobs", 95);
        m.put("Howard", 96);
        System.out.println(m);
        //System.out.println(m.get("Bill"));
        
        String name=JOptionPane.showInputDialog("Enter you name");
        System.out.println(m.get(name));
        
    }
    
}
