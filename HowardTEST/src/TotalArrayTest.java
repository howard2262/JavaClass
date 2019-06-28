
public class TotalArrayTest {

    public static void main(String[] args) {
      
       TotalArray a = new TotalArray();
       a.setName("Tom");
       a.setScores("History", 90);
       a.setScores("English", 80);
       a.setScores("Chemistry", 70);
       
       TotalArray b= new TotalArray();
       b.setName("John");
       b.setScores(0, 95);
       b.setScores(1, 85);
       b.setScores(2, 75);
       
       a.displayInfo();
       b.displayInfo();
        
        
    }
    
}
