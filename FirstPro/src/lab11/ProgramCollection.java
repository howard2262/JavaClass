
package lab11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
public class ProgramCollection {

    public static void main(String[] args) {
        
        List<String> listProgram;
        Set<String> setProgram;
        
        listProgram = new ArrayList<>();
        setProgram = new HashSet<>();
        
        PutStuff(listProgram);
        PutStuff(setProgram);   
    }
    
    private static void PutStuff (Collection x){
    if (x instanceof List){
        System.out.println("List Sequential");
    }
    if (x instanceof Set){
        System.out.println("Set non-sequential and non-reapet");
    }
    x.add("Java");
    x.add("C++");
    x.add("PHP");
    x.add("Json");
    x.add("Java");
    
        System.out.println("Size: "+x.size());
        System.out.println(x);
        System.out.println("");
    }
    
}
