package lab07;

import java.sql.SQLPermission;
import java.util.ArrayList;
import javafx.scene.paint.Color;

public class FruitArrayList {

    public static void main(String[] args) {

        //ArrayList  動態陣列，可任意加入或刪除物件，不限種類
        //String  字串陣列，大小固定不變
        ArrayList a = new ArrayList();  //建立 a 為動態陣列參考變數
        System.out.println("-----New information-----");

        a.add("Apple");        // .add 增加第0項
        a.add("Banana");       // .add 增加第1項
        a.add("Pieapple");     // .add 增加第2項
        a.add("Lemon");        // .add 增加第3項
        a.add("Watermelon");   // .add 增加第4項

        System.out.println(a.toString());
        //將 a 轉換成文字輸出
        //簡化寫法為 System.out.println(a);

        System.out.println("-----Array Size-----");
        System.out.println("Array size: " + a.size());
        // .size 為 ArrayList的寫法，不同於Array的 .length
        // .size 為求出陣列的大小 (長度)

        System.out.println("-----Edit information-----");
        int index = 0;
        System.out.println("Index: " + index);
        a.set(index, "Tomato");
        // .set 為修改現有陣列

        System.out.println(a.toString());

        Object obj = a.get(index);
        // Object 萬用型別(可用文字與數字)
        // get 取值

        System.out.println(obj);

        System.out.println("-----Inquire position of index-----");
        obj = "Bananana";
        index = a.indexOf(obj);
        // .indexOf 為尋找物件，查詢不到 index=-1

        System.out.println("Object: " + obj);
        System.out.println("Index: " + index);
        System.out.println(a.toString());

        System.out.println("-----Delete information-----");

        index = 0;
        obj = a.remove(index);
        //  .remove 取出(刪除指令)        

        System.out.println("Index: " + index);
        System.out.println("Take out: " + obj);
        System.out.println("The size of Array: " + a.size());
        System.out.println(a.toString());
        System.out.println();

        index = a.size() - 1;  // .size()-1指得是陣列中的最後一項
        obj = a.remove(index);
        System.out.println("Index: " + index);
        System.out.println("Take out: " + obj);
        System.out.println("The size of Array: " + a.size());
        System.out.println(a.toString());
        System.out.println();

        boolean IfSuccessful;
        // boolean值,ture為成功，false為失敗
        
        obj = "Lemon";
        IfSuccessful = a.remove(obj);
        System.out.println("Object: " + obj);
        System.out.println("Take " + obj + " out: " + IfSuccessful);
        System.out.println(a.toString());

        obj = "Papaya";
        IfSuccessful = a.remove(obj);

        System.out.println("Object: " + obj);
        System.out.println("Take " + obj + " out: " + IfSuccessful);
        System.out.println(a.toString());

    }

}
