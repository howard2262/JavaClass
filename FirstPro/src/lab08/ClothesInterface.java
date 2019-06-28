package lab08;

public abstract class ClothesInterface implements TextileInterface {

    private int ID;
    private String Name;
    private int Price;
    private static int Amount;
    private char Size;
    private char Color;

    public ClothesInterface(String Name, int Price, char Size, char Color) {
        this.Name = Name;
        this.Price = Price;
        this.Size = Size;
        this.Color = Color;
        this.setID();

    }

    public int setID() {
        Amount = Amount + 1;
        ID = Amount;
        return ID;

    }

    @Override
    public void ableDisplay() {
        System.out.println("ID: " + ID);
        System.out.println("Product: " + this.Name);
        System.out.println("Price: " + this.Price);
        System.out.println("Size: " + this.Size);
        System.out.println("Color: " + this.Color);

    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return Price;
    }

    public static int getAmount() {
        return Amount;
    }

    public char getSize() {
        return Size;
    }

    public char getColor() {
        return Color;
    }
    
    

}
