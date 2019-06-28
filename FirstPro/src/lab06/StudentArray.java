
package lab06;


public class StudentArray {
    
  private String name;
  private int [] scores = new int[3];//設定一個陣列scores為私有、int，並產生3個int空間
  
  public void SetName (String name){
  this.name=name;
  }

  public void SetScores(int index, int score){ 
               //index為陣列計數碼=0，socre為陣列值=80: a.SetScores(0, 80);
  this.scores[index]=score; // 
   
  }
  public void displayinfo(){
      System.out.println(this.name); 
  for(int i=0; i<this.scores.length; i++){
  int score=this.scores[i];
      System.out.println(score);
  
  }
  
  }  
    
}
