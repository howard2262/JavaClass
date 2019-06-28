package lab03;

public class Classwork03 {

    String firstname;
    String lastname;

    public void displayfullname() {
        StringBuilder sb = new StringBuilder();
        String Fullname;
        Fullname= sb.append(firstname).append(" ").append(lastname).toString();
        System.out.println(Fullname);

    }

}
