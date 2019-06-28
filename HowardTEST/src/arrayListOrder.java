
import java.util.ArrayList;

public class arrayListOrder {

    public static void main(String[] args) {

        ArrayList Fruit = new ArrayList();
        System.out.println("------added information-----");

        Fruit.add("Apple");
        Fruit.add("Watermelon");
        Fruit.add("Mango");
        Fruit.add("Banana");
        Fruit.add("Papaya");
        System.out.println(Fruit);

        System.out.println("-------The Array of size------");
        System.out.println("Array of Size: " + Fruit.size());

        System.out.println("-------Update information------");
        int index = 0;
        String Name = "Tomato";
        Fruit.set(index, Name);
        System.out.println("Update Fruit: " + Name);
        System.out.println(Fruit);

        System.out.println("------Acquire information------");
        index = 2;
        Object obj = Fruit.get(index);
        System.out.println("Index: " + index);
        System.out.println("The object of array: " + obj);
        System.out.println(Fruit);

        System.out.println("------Deleted information------");
        Fruit.remove(obj);
        System.out.println("Deleted object: " + obj);
        System.out.println("The size of Array: " + Fruit.size());
        System.out.println(Fruit);

        index = Fruit.size() - 1;
        obj = Fruit.get(index);
        Fruit.remove(index);
        System.out.println("Deleted object: " + obj);
        System.out.println("The size of Array: " + Fruit.size());
        System.out.println(Fruit);

        boolean Continuing;
        index = 1;
        obj = Fruit.get(index);
        Continuing = Fruit.remove(obj);
        System.out.println("Deleted odject: " + obj);
        System.out.println("Deleted successful: " + Continuing);
        System.out.println(Fruit);
           
        obj = "Sugar";
        Continuing = Fruit.remove(obj);
        System.out.println("Deleted odject: " + obj);
        System.out.println("Deleted successful: " + Continuing);
        System.out.println(Fruit);
    

    }

}
