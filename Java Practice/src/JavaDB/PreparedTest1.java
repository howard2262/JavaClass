package JavaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class PreparedTest1 {

    public static void main(String[] args) {

        String url = "jdbc:derby://localhost:1527/EmployeeDate";
        String user = "Howard";
        String pass = "12345";
        //隱碼攻擊
        // 輸入1'OR '1'='1
        
        
        String putFirstName = JOptionPane.showInputDialog("Enter a firstName you want to inquire");
        String query = "select * from employee where firstName='"+putFirstName+"'";
        System.out.println("Query: " + query);

        try (
                Connection con = DriverManager.getConnection(url, user, pass);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query)) {

            int count = 0;
            while (rs.next()) {
                count++;
                int id = rs.getInt("id");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                java.util.Date birthDate = rs.getDate("birthDate");
                float salary = rs.getFloat("salary");
                
                //String Format
                // %d Integer
                // %s String
                // - align left
                // 數字 寬度幾個字
                //-20%s 字串格式，總寬度20字，靠左對齊
                String resultText = String.format("%d \t %-20s %s %15s ",
                        id,
                        firstName + " " + lastName,
                        birthDate,
                        NumberFormat.getCurrencyInstance(Locale.US).format(salary));
                System.out.println(resultText);
            }
            if (count == 0) {
                System.out.println("The name doesn't existed in the DataBase");
            }

        } catch (SQLException e) {
            System.err.println(e);
        }

    }

}
