
package lab08;

public abstract class ToyInterface implements ReturnInterface, TextileInterface{
    
    private String Name;
    private int Price;

    public ToyInterface(String Name, int Price) {
        this.Name = Name;
        this.Price = Price;
    }
    
    @Override
    public void ableDisplay(){
        System.out.println("Toy Name: "+ this.Name);
        System.out.println("Toy Price: "+ this.Price);
    
    }
    @Override
    public String ReturnDetail(){
    return "The toy cannot be return";
    }
    
}
