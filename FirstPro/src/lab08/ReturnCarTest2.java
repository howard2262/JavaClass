package lab08;

public class ReturnCarTest2 {

    public static void main(String[] args) {

        EXclothes a = new EXclothes("Judi", 1200, 'S', 'B');
        EXpants b = new EXpants('F', "Ghost", 2300, 'M',
                 'R');
        Exunderwear c = new Exunderwear("Beauty", 2000, 'M', 'W');
        ToyAbstract d = new ToyAbstract("King", 3000);
        
        ReturnCarInstanceOf e = new ReturnCarInstanceOf();
        e.addItem(a);
        e.addItem(b);
        e.addItem(c);
        e.addItem(d);
        e.displayToy();

    }

}
