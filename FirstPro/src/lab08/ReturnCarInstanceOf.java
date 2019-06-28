package lab08;

import java.util.ArrayList;

public class ReturnCarInstanceOf {

    private ArrayList<ReturnInterface> arrayCart;

    public ReturnCarInstanceOf() {
        arrayCart = new ArrayList<>();
    }

    public void addItem(ReturnInterface x) {
        arrayCart.add(x);
    }

    public void displayToy() {
        for (ReturnInterface i: arrayCart){
         if (i instanceof Extextile){
             ((Extextile)i).displayInfo();
          }      
             else if (i instanceof ToyAbstract)   {
             ((ToyAbstract)i).displayToyInfo();
             }
            System.out.println(i.ReturnDetail());
            System.out.println("-------------------------");
        }
           
        
    }
}
