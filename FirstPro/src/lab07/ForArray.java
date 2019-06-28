package lab07;

import java.util.ArrayList;

public class ForArray {

    public static void main(String[] args) {

        ArrayList a = new ArrayList();
        // 建立動態陣列

        //放入物件
        a.add("Chemistry");
        a.add("English");
        a.add("History");

        //用迴圈讀取陣列 (走訪陣列)
        for (int i = 0; i < a.size(); i++) {
            Object obj;
            obj = a.get(i);
            // 讀取物件，obj為取得i的結果
            System.out.println(obj);
        }
        System.out.println("------------------");

        ArrayList b = new ArrayList();
        // 動態陣列只能放入物件，int不是物件

        b.add(new Integer(100));
        //建立int為物件的完整寫法

        b.add(90);
        //簡化寫法,java會自動轉換成int物件
        b.add(80);

        for (int j = 0; j < b.size(); j++) {
            Object obj = b.get(j);
            System.out.println(obj);

        }

    }

}
