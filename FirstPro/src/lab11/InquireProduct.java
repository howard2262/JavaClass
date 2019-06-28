
package lab11;

public class InquireProduct {
    
    private String ID;
    private String Name;
    private int Price;
    
    public InquireProduct (String id, String name, int price){
    this.ID = id;
    this.Name= name;
    this.Price = price;
    
    }
    @Override
    public String toString(){
    return "Product ID: "+ this.ID+"\nProduct Name: "+this.Name+"\nProduct Price: "+this.Price;
    
    }
    
}
