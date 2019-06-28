package lab04;

public class BMImodel {

    double hei;
    double wei;
  
    public BMImodel() {
         hei = 0;
         wei = 0;
 
    }

    public void setHeight(int hei) {
        this.hei = hei;
    }

    public void setWeight(int wei) {
        this.wei = wei;
    }

    public double getHei() {
        return hei;
    }

    public double getWei() {
        return wei;
    }
    
    public double getBmi(){
    
        double m2=hei/100;
        double bmi= wei/m2;
        
        return bmi;

    
    }

}
