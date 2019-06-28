package lab11;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import javax.security.auth.Subject;
import javax.swing.JOptionPane;

public class StudentMap {

    private String Name;
    private Map<String, Integer> TomGrade;
    private Map<String, Integer> JoshGrade;
    private Map<String, Integer> EmmaGrade;

    private String[] subject = {"Chemical", "History", "Science"};

    public static final String Tom = "Tom";
    public static final String Josh = "Josh";
    public static final String Emma = "Emma";

    public StudentMap() {
        
        TomGrade = new HashMap<>();
        TomGrade.put("Chemical", 0);
        TomGrade.put("History", 0);
        TomGrade.put("Science", 0);

        JoshGrade = new HashMap<>();
        JoshGrade.put("Chemical", 0);
        JoshGrade.put("History", 0);
        JoshGrade.put("Science", 0);

        EmmaGrade = new HashMap<>();
        EmmaGrade.put("Chemical", 0);
        EmmaGrade.put("History", 0);
        EmmaGrade.put("Science", 0);

    }

    public String setName(String name) {
        this.Name = name;
        return name;
    }

    public void setScore() {
        String scoreText;
        if (Name == "Tom") {
            for (int i = 0; i < TomGrade.size(); i++) {
                scoreText = JOptionPane.showInputDialog("Enter your " + subject[i] + " score in below");
                int score = Integer.parseInt(scoreText);
                TomGrade.put(subject[i], score);
            }

        } else if (Name == "Josh") {
            for (int i = 0; i < JoshGrade.size(); i++) {
                scoreText = JOptionPane.showInputDialog("Enter your " + subject[i] + " score in below");
                int score = Integer.parseInt(scoreText);
                JoshGrade.put(subject[i], score);
            }

        } else if (Name == "Emma") {
            for (int i = 0; i < EmmaGrade.size(); i++) {
                scoreText = JOptionPane.showInputDialog("Enter your " + subject[i] + " score in below");
                int score = Integer.parseInt(scoreText);
                EmmaGrade.put(subject[i], score);
            }
        }
    }

    public void display() {
        int Total = 0;
        System.out.println(Name);
        if (Name == "Josh") {
            System.out.println("Grades: " + JoshGrade);
            for (int i = 0; i < JoshGrade.size(); i++) {
                Total = Total + JoshGrade.get(subject[i]);
            }
            System.out.println("Total: " + Total);
        } else if (Name == "Tom") {
            System.out.println("Grades: " + TomGrade);
            for (int i = 0; i < TomGrade.size(); i++) {
                Total = Total + TomGrade.get(subject[i]);
            }
            System.out.println("Total: " + Total);
        } else if (Name == "Emma") {
            System.out.println("Grades: " + EmmaGrade);
            int EmmaTotal = EmmaGrade.get("Chemical") + EmmaGrade.get("History") + EmmaGrade.get("Science");
            System.out.println("Total: " + EmmaTotal);

        }

    }
}
