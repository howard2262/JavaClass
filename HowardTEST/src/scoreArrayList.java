
import java.util.ArrayList;

public class scoreArrayList {

    private ArrayList<Integer> Scores;
    private ArrayList<String> Subjects;
    private String Name;

    public final static String Chemistry = "Chemistry";
    public final static String History = "History";
    public final static String Science = "Science";

    public scoreArrayList() {

        Name = "Not setting";
        Scores = new ArrayList<>();
        Scores.add(new Integer(0));
        Scores.add(new Integer(0));
        Scores.add(new Integer(0));

        Subjects = new ArrayList<>();
        Subjects.add(new String("Chemistry"));
        Subjects.add(new String("History"));
        Subjects.add(new String("Science"));

    }

    public void setName(String name) {
        if (name == null || name.length() < 2) {
            System.out.println("Wrong Name: " + name);
            return;
        }
        this.Name = name;
    }


    public void setScore(String subject, int score) {
        int index = this.Subjects.indexOf(subject);
        if (index < 0 || index > Subjects.size()) {
            System.out.println("The subject doesn't exsited: " + subject);
        }
            else if (score < 0 || score > 100) {
            System.out.println("Wrong score: " + score);           
            return;
        }
        this.Scores.set(index, score);
    }

    public void display() {
        StringBuilder text = new StringBuilder();
        text.append(this.Name).append("\n");

        for (int i = 0; i < Scores.size(); i++) {
            Integer index = this.Scores.get(i);
            int Value = index.intValue();
            String Sindex = this.Subjects.get(i);
            text.append("No.").append(i + 1).append(" is ").append(Sindex).append(" = ").append(Value).append(" / ");
        }
        int total;
        total = getTotal();
        text.append(" / Total = ").append(total).append(" ");
        System.out.println(text);
    }

    public int getTotal() {

        int total = 0;
        for (int i = 0; i < Scores.size(); i++) {
            Integer index = this.Scores.get(i);
            int value = index.intValue();
            total = total + value;
        }
        return total;

    }
}
