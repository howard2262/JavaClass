
public class TestVoidMethod {

    public static void main(String[] args) {
      
        System.out.println("The grade is ");
        printGrade(78.5);
        printGrade(59.5);
        }
        public static void printGrade(double score){
         if (score>=90){
            System.out.println('A');
        }
        if (score>=80){
            System.out.println('B');   
        }
        if (score>=70){
            System.out.println('C');
        }
         if (score>=60){
            System.out.println('D');
        }
         else {
           System.out.println('F');  
             
         }
        }     
}
