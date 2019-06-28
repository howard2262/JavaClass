package lab07;

import java.util.ArrayList;

public class StudentArrayEdit {

    private String Name;
    private ArrayList<Integer> Scores;
    private ArrayList<String> Subjects;

    public final static String History = "History";
    public final static String English = "English";
    public final static String Chemistry = "Chemistry";

    public StudentArrayEdit() {
        Name = "Not setting";
        Scores = new ArrayList<>();
        Scores.add(0);
        Scores.add(0);
        Scores.add(0);

        Subjects = new ArrayList<>();
        Subjects.add("History");
        Subjects.add("English");
        Subjects.add("Chemistry");

    }

    public void setName(String name) {
        if (name == null || name.length() < 2) {
            System.out.println("Name cannot be null, or less than two words");
            System.out.println("Wrong Name" + name);
        }
        this.Name = name;

    }

    public void setScores(String subject, int score) {
        int index = Subjects.indexOf(subject);
        if (index < 0) {
            System.out.println("Doesn't existed subject: " + subject);
        }
        Scores.set(index, score);
    }

    public void displayInfo() {
        StringBuilder text = new StringBuilder();
        text.append(Name);
        text.append(" ");

        for (int i = 0; i < Subjects.size(); i++) {
            String Sub = Subjects.get(i);
            int Sco = Scores.get(i);
            text.append(Sub).append("=").append(Sco).append(" / ");
        }
        int total = getTotal();
        text.append("The Total").append("=").append(total);
        System.out.println(text.toString());
    }

    public int getTotal() {
        int total = 0;
        for(int value: Scores){
        total+=value;       
        }
        return total;

    }

}
