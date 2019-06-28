
package lab08;

import java.util.ArrayList;
public class ReturnCar {
    
ArrayList<ReturnInterface> arrayCar;

public ReturnCar (){
arrayCar = new ArrayList<>();
}
 
public void addItem (ReturnInterface x){
arrayCar.add(x);

}

public void displayReturn () {
for (ReturnInterface i:arrayCar){
((Extextile)i).displayInfo();
    System.out.println(i.ReturnDetail());
}


}
    
}
