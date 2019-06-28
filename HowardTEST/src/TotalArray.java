
public class TotalArray {

    private String Name;
    private int[] Scores = new int[3];
    private String[] Subjects = {"History", "English", "Chemistry"};

    public void setName(String name) {
        if (name == null || name.length() < 2) {
            System.out.println("The Name cannot be null or less than two words");
            System.out.println("Wrong Name: " + name);
            return;
        }
        this.Name = name;
    }

    public void setScores(int index, int score) {
        if (index < 0 || index >= Scores.length || score < 0 || score > 100) {
            System.out.println("Index cannot < 0 or, > " + Scores.length + "The socre need between 0~100");
            System.out.println("Index: " + index);
            System.out.println("Score: " + score);
            return;
        }
        this.Scores[index] = score;
    }

    public void setScores(String subject, int socre) {
        int index = this.inquireIndex(subject);
        if (index < 0) {
            System.out.println("The subject doesn't existed ");
            return;
        }
        this.setScores(index, socre);
    }

    public int inquireIndex(String subject) {
        for (int i = 0; i < Subjects.length; i++) {
            String text = this.Subjects[i];
            if (text.equals(subject)) {
                System.out.println("It finded to No." + i);
                return i;
            }
        }
        return -1;
    }

    public void displayInfo() {
        System.out.println(this.Name);
        for (int i = 0; i < this.Scores.length; i++) {
            String Sub = this.Subjects[i];
            System.out.println(Sub);
            int Sco = this.Scores[i];
            System.out.println(Sco);
        }
        System.out.println("-----------------------");

        int total = getTotal();
        System.out.println("The Total: " + total);
    }

    public int getTotal() {
        int total = 0;
        for (int i = 0; i < this.Scores.length; i++) {
            int score = this.Scores[i];
            total = total + this.Scores[i];
        }
        return total;

    }

}
