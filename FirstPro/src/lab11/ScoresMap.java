package lab11;

import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import javax.swing.JOptionPane;
public class ScoresMap {

    public static void main(String[] args) {

        Map<String, Integer> grade = new HashMap<>();
        grade.put("Chemical", 90);
        grade.put("History", 78);
        grade.put("Science", 87);

        Set<String> Keys;
        Keys = grade.keySet();
        System.out.println("Set: " + Keys);
        for (String s : Keys) {
            System.out.println(s);
        }
        Collection<Integer> Scores;
        Scores = grade.values();
        System.out.println("Colletion: " + Scores);
        for (Integer i : Scores) {
            System.out.println(i);
        }

        String text = JOptionPane.showInputDialog("Enter your Key");
        System.out.println("The value: " + grade.get(text));

    }
}


