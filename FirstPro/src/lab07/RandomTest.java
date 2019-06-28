
package lab07;

import java.util.Random;
public class RandomTest {

    public static void main(String[] args) {
    
    Random Number = new Random();
    
    for (int i = 0 ; i < 10 ; i ++){
    int value = Number.nextInt(10);
        System.out.println("The Radom is "+ value);
    
    }
        
        
    }
    
}
