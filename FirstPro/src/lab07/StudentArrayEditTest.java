package lab07;

public class StudentArrayEditTest {

    public static void main(String[] args) {

        StudentArrayEdit a = new StudentArrayEdit();
        a.setName("Tom");
        a.setScores(StudentArrayEdit.History, 98);
        a.setScores(StudentArrayEdit.English, 88);
        a.setScores(StudentArrayEdit.Chemistry, 78);

        a.displayInfo();

    }

}
