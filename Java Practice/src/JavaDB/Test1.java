package JavaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {

    public static void main(String[] args) {

        String url = "jdbc:derby://localhost:1527/EmployeeDate";
        String user = "Howard";
        String pass = "12345";

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection(url, user, pass);

            stmt = con.createStatement();
            String query = "select * from employee";
            rs = stmt.executeQuery(query);

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
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }

    }

}
