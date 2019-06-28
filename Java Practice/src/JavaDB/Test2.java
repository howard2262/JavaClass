package JavaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test2 {

    public static void main(String[] args) {

        String url = "jdbc:derby://localhost:1527/EmployeeDate";
        String user = "Howard";
        String pass = "12345";

        try (
                Connection con = DriverManager.getConnection(url, user, pass);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from employee")) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                java.util.Date birthDate = rs.getDate("birthDate");
                float salary = rs.getFloat("salary");

                System.out.println(id + " " + firstName + " " + lastName + " " + birthDate + " " + salary);

            }

        } catch (SQLException e) {
            System.err.println(e);
        }

    }

}
