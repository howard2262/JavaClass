package lab01;


public class BMI轉換 {

   
    public static void main(String[] args) {


        double 身高cm = 171;
        double 體重kg = 60;

        double 身高m = 身高cm/100;
        double BMI = 體重kg / (身高m * 身高m);

        System.out.println("身高" + 身高cm);
        System.out.println("體重" + 體重kg);
        System.out.println("BMI" + BMI);
    }

}
