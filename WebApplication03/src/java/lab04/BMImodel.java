package lab04;

public class BMImodel {

    double hei;
    double wei;
    double bmi;

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

    public double getBmi() {

        double m2 = hei / 100;
        bmi = wei / m2;
        return bmi;

    }

    public String getResult() {
        String text = "";
        if (bmi >= 40) {
            text = "Heavy overweight";
        } else if (bmi >= 35) {
            text = "Middle overright";
        } else if (bmi >= 30) {
            text = "Light overright";
        } else if (bmi >= 27) {
            text = "little Overweight";
        } else {
            text = "Normal Weight";
        }
        return text;
    }

}
