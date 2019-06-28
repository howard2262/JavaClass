package lab04;

public class Average {

    String title;
    int total = 0;
    int count = 0;

    public int add(int score) {
        count = count + 1;
        total = total + score;
        return total;

    }

}
