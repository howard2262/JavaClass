package lab07;

import java.util.ArrayList;

public class LimiteArrayType1 {
// 限定型別的動態陣列

    public static void main(String[] args) {

        ArrayList<Integer> Number = new ArrayList<>();
        //限定動態陣列變數Number為int型別，並新增可擴充的欄位空間

        Number.add(new Integer(100));
        //新增一個型別int 100在Number身上
        //簡化寫法 Number.add(100);
        Number.add(new Integer(90));
        Number.add(new Integer(80));

        
       
        for (int invalue : Number) {
            System.out.println(invalue);
            
        /*  完整寫法
            for (int i = 0; i < Number.size(); i++) {
                Integer obj = Number.get(i);
              //Integer可將obj宣告為物件，並可引用函數，但int無法  
                int inValue = obj.intValue();
                String text = "No." + i + " is " + inValue;
                System.out.println(text);
        */

            }

        }

    }


