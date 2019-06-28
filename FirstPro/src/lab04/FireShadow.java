
package lab04;

public class FireShadow {
  
    String name;
    int MP;
    
    public void eat(FireShadowda da){ //可從FireShadowda檔案中取資料，取回的資料稱為da
    System.out.println("補充查克拉"+da.X);//取得FireShadowda檔案中的變數X
    MP = MP+da.X;
            }
    public void 分身(){
    if (MP>=10){
        System.out.println("分身成功，消耗10查克拉");
        MP=MP-10;
    } else {
        System.out.println("能量不足");         
       }   
    } 
     public void display(){
         System.out.println("..........");
         System.out.println("Name: "+ name);
         System.out.println("MP: "+MP);
       
               
    
    }
    
    
    
}
