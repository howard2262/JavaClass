package lab03;

import java.util.Map;
import java.util.HashMap;

public class AnniversaryModel {

    private int year = 1;
    private static final Map<Integer, String> map = new HashMap();

    public AnniversaryModel() {

        map.put(1, "Paper");
        map.put(2, "Cotton");
        map.put(3, "Leather");

    }

    public void setYear(int year) {
        this.year = year;

    }

    public int getYear() {
        return year;
    }

    public String getMaterial() {
        return map.get(year);

    }

}
