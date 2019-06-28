
package lab08;


public class ToyAbstract implements ReturnInterface{
    
    private String Name;
    private int Price;

    public ToyAbstract(String Name, int Price) {
        this.Name = Name;
        this.Price = Price;
    }
    
    public void displayToyInfo() {
        System.out.println("Toy Name: " +this.Name);
        System.out.println("Toy Price: "+this.Price);
           
    }
    
    @Override
    public String ReturnDetail (){
    return "Toy canot return";
    }
    
}
