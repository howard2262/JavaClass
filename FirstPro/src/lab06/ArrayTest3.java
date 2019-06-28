
package lab06;

public class ArrayTest3 {

    public static void main(String[] args) {
     
        SubArray3 a=new SubArray3();
        a.SetNane("Tom");
        a.setScores("Chinese", 85);
        a.setScores("English", 65);
        a.setScores("Math", 65);
        
        SubArray3 b=new SubArray3();
        b.SetNane("Marry");
        b.SetScores(0, 92);
        b.SetScores(1, 72);
        b.SetScores(2, 72);
        
        a.displayinfo();
        b.displayinfo();
        
    }    
        
        
    }
    

