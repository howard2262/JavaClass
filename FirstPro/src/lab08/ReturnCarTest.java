package lab08;

public class ReturnCarTest {

    public static void main(String[] args) {

        EXclothes a = new EXclothes("Judi", 1200, 'S', 'B');
        EXpants b = new EXpants('F', "Ghost", 2300, 'M'
        , 'R');
        Exunderwear c = new Exunderwear("Beauty", 2000, 'M', 'W');

        ReturnCar d = new ReturnCar();
        d.addItem(a);
        d.addItem(b);
        d.addItem(c);
        d.displayReturn();
        
        ShoppingCar e = new ShoppingCar();
        e.additem(a);
        e.additem(b);

        e.displayTotal();
        

    }

}
