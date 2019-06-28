
package lab08;

public class EXclothes extends Extextile implements ReturnInterface{

    public EXclothes(String Name, int Price, char Size, char Color) {
        super(Name, Price, Size, Color);
        }
        @Override
        public String ReturnDetail(){
        return "Clothes of return within seven days ";
    }
    }
        
    
    
    

