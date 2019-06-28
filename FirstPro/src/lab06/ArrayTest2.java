
package lab06;

public class ArrayTest2 {
 
    private String name;
    private int [] scores= new int[3];
    
    public void SetName (String name){
    if (name==null||name.length()<2){
        System.out.println("the name cannot be null or less than two words");
        System.out.println("Name: "+name);
        return;
      }
     this.name=name;
        }    
      
     public void setScores (int index, int score){
     if (index<0 ||index>=scores.length||score<0||score>100) {
         System.out.println("index cannot >0 or <"+scores.length+" and the score must between 0 and 100");
         System.out.println("index"+index);
         System.out.println("Score"+score);
     return;
    }
    
     this.scores=scores;
    }
    public void displayinfo(){
        System.out.println(this.name);
        for (int i=0;i<scores.length;i++){
        int score = this.scores[i];
        System.out.println(score);
    
    }
}
    
    
    
}
