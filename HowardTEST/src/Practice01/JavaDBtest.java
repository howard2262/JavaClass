package Practice01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import java.util.Locale;

public class JavaDBtest {

    public static void main(String[] args) {

        String url = "jdbc:derby://localhost:1527/EmployeeDate";
        String user = "Howard";
        String pass = "12345";

        String putFirstName = JOptionPane.showInputDialog("Please enter the FirstName you want to inquire");
        String sqlOrder = "select * from employee where firstname=?";
        //                             table           column
        System.out.println("SQL Order: " + sqlOrder);

        try (
                Connection con = DriverManager.getConnection(url, user, pass);
                PreparedStatement pstmt = con.prepareStatement(sqlOrder);
                ) {

            pstmt.setString(1, putFirstName);
            ResultSet rs = pstmt.executeQuery();
            int count = 0;

            while (rs.next()) {
                count++;
                int id = rs.getInt("id");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                java.util.Date birthDate = rs.getDate("birthDate");
                float salary = rs.getFloat("salary");

                String resultText = String.format("%d \t %-20s %s %15s ",
                        id,
                        firstName + " " + lastName,
                        birthDate,
                        NumberFormat.getCurrencyInstance(Locale.US).format(salary));
                System.out.println(resultText);
            }
            if (count==0){
                System.out.println("The name doesn't existed in the DataBase");
            }
            }catch (SQLException se) {
            System.err.println(se);
        }
        }
    }


