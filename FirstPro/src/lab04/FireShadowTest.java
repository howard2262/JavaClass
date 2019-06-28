
package lab04;

public class FireShadowTest {

   
    public static void main(String[] args) {
    FireShadow a = new FireShadow();//新增指令a在火影file
    a.name="鳴人";
    a.display();//用a執行火影的display method
           
    FireShadowda b = new FireShadowda();
    b.X=5;
    a.eat(b);//用a執行FireShadow的eat method並代入b
    a.分身();//用a執行FireShadow的分身方法
    a.display();
        
    }
    
}
