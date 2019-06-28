package lab07;

import java.util.ArrayList;

public class LimiteArrayType2 {

    public static void main(String[] args) {

        ArrayList<String> subjects = new ArrayList<>();

        subjects.add(new String("History"));
        subjects.add(new String("English"));
        subjects.add(new String("Chemistry"));

        for (String output : subjects) {
            System.out.println(output);

        }
        /*  完整寫法    
     for (int i=0; i< subjects.size();i++){
         String output = subjects.get(i);
             System.out.println("No."+i+" is "+output);
         */

    }

}


