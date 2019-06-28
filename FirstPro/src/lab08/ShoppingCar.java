package lab08;

import java.util.ArrayList;

public class ShoppingCar {

    private ArrayList<Extextile> a;
    private int TotalMoney;

    public ShoppingCar() {
        a = new ArrayList<>();
        TotalMoney = 0;
    }

    public void additem(Extextile x) {
        TotalMoney = TotalMoney + x.getPrice();
        a.add(x);

    }
    
    public void displayTotal (){
        for (Extextile j: a) {
            j.displayInfo();
            System.out.println("---------------------");
        }
        System.out.println("Total: "+ TotalMoney);
    
    }

    
    }


