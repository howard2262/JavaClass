
package lab08;

public class EXpants extends Extextile implements ReturnInterface {

    private char Gender;

    public EXpants(char Gender,String Name, int Price, char Size, char Color) {
        super(Name, Price, Size, Color);
        this.Gender = Gender;
    }
    @Override
    public void displayInfo(){
    super.displayInfo();
    System.out.println("Gender: "+ Gender);
    
    }
    
    @Override
    public String ReturnDetail (){
    return "The pants of Return within three days";
    }
    
}
