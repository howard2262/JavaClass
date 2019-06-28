
package lab06;

public class StudentArrayShow {

    public static void main(String[] args) {
    
        StudentArray a=new StudentArray();
        a.SetName("Tom");
        a.SetScores(0, 80);
        a.SetScores(1, 65);
        a.SetScores(2, 60);
        
        StudentArray b=new StudentArray();
        b.SetName("Marry");
        b.SetScores(0, 90);
        b.SetScores(1, 70);
        b.SetScores(2, 78);
        
        a.displayinfo();
        b.displayinfo();
        
    }
    
}
