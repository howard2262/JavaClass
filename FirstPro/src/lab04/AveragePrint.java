package lab04;

public class AveragePrint {

    public void fullname(NameStudent x) {
        String s = x.fullname() + "\t" + x.eng + "\t" + x.math;
        System.out.println(s);
    }

    public void printTotal(Average cal) {
        String s1 = cal.title + " " + cal.total;
        System.out.println(s1);
    }

    public void PrintAvg(Average cal) {
        int avg = cal.total / cal.count;
      
        System.out.println(cal.title+avg);

    }

   

}
