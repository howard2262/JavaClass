package Practice01;

public class Textile {

    private int ID;
    private String Name;
    private static int Amount;
    private int Price;
    private char Size;
    private char Color;

    public Textile(String Name, int Price, char Size, char Color) {
        this.Name = Name;
        this.Price = Price;
        this.Size = Size;
        this.Color = Color;
        setID();
    }

    public int setID() {
        Amount += 1;
        ID = Amount;
        return ID;
    }

    public void displayDetail() {
        System.out.println("ID: " + ID);
        System.out.println("Product: " + Name);
        System.out.println("Price: " + Price);
        System.out.println("Size: " + Size);
        System.out.println("Color: " + Color);

    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public static int getAmount() {
        return Amount;
    }

    public int getPrice() {
        return Price;
    }

    public char getSize() {
        return Size;
    }

    public char getColor() {
        return Color;
    }

}
