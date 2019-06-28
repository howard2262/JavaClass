package lab07;

import java.util.Random;

public class MoraRandom {

    private static final int Scissors = 0;
    private static final int Stone = 1;
    private static final int Cloth = 2;
    private String[] subjects = {"Scissors", "Stone", "Paper"};
    int [] Array= new int[3]; 

    Random Number = new Random();

    public void MoraGame() {
      
        for (int i = 0; i < 10; i++) {
            int value = Number.nextInt(3);
            System.out.println(value + " " + subjects[value]);
            Array[value]++;
        }
         for (int j = 0 ; j < 3 ; j++) {
             System.out.println(subjects[j]+": "+Array[j] +"times");
         
         }
        
        }
    }



