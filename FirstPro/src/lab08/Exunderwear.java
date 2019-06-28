
package lab08;


public class Exunderwear extends Extextile implements ReturnInterface{

    public Exunderwear(String Name, int Price, char Size, char Color) {
        super(Name, Price, Size, Color);
    }
   @Override
   public String ReturnDetail (){
   return "Underwear of return within seven days";
   }
    
}
