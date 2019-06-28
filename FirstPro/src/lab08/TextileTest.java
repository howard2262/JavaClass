package lab08;

public class TextileTest {

    public static void main(String[] args) {

        EXclothes a = new EXclothes("Shirt", 2000, 'M', 'G');
        EXpants b = new EXpants('M', "cool", 1500, 'M', 'R');
        
        ShoppingCar c = new ShoppingCar();
        c.additem(a);
        c.additem(b);
        c.displayTotal();
        
        
    }

}
