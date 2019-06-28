
import javax.swing.JOptionPane;

public class PracticeClass {

    String name;
    double cm, kg;

    public void input() {

        String name1, cm1, kg1;
        name1 = JOptionPane.showInputDialog("name");
        cm1 = JOptionPane.showInputDialog("height");
        kg1 = JOptionPane.showInputDialog("Weight");

        this.name = name1;
        this.cm = Double.parseDouble(cm1);
        this.kg = Double.parseDouble(kg1);

    }

    public void display() {

        double m = this.cm / 100D;
        double bmi = this.kg / (m * m);

        System.out.print(name);
        System.out.print("\t");
        System.out.print(cm);
        System.out.print("\t");
        System.out.print(kg);
        System.out.print("\t");
        System.out.println(bmi);

    }

}
