
package lab08;

import java.util.ArrayList;
public class ReturnCartInstance3 {
    
    ArrayList<ReturnInterface> arrayCar;
    
    public ReturnCartInstance3 () {
    arrayCar= new ArrayList<>();
    
    }
    
    public void addItem (ReturnInterface x){
    arrayCar.add(x);

    }
    public void displayReturn () {
    for (ReturnInterface i: arrayCar){
    if (i instanceof ClothesInterface) {
        ((ClothesInterface)i).ableDisplay();
    }
          System.out.println(i.ReturnDetail());
    }
    
    
    }
    
}
