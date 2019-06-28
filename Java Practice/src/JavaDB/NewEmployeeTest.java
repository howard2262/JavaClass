
package JavaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.Calendar;

public class NewEmployeeTest {

    public static void main(String[] args) {
     
      Calendar cal = Calendar.getInstance();
      cal.set(1980, 5,10);
      Date birthDate = cal.getTime();
      
      NewEmployee staff = new NewEmployee(117, "Johnny", "Ball", birthDate, 18924);
        
        String url = "jdbc:derby://localhost:1527/EmployeeDate";
        String user = "Howard";
        String pass = "12345";
        String request = "insert into employee values(?,?,?,?,?)";
        
                try (
                Connection con = DriverManager.getConnection(url, user, pass);
                PreparedStatement pstmt = con.prepareStatement(request);
                ) {
                pstmt.setInt(1, staff.getId());
                pstmt.setString(2, staff.getFirstName());
                pstmt.setString(3, staff.getLastName());
                
                Date dateX = staff.getBirthDate();
                long timeX = dateX.getTime();
                java.sql.Date sqlDate = new java.sql.Date(timeX);
                pstmt.setDate(4, sqlDate);
                
                pstmt.setFloat(5, staff.getSalary());
                
                if (pstmt.executeUpdate()==1){
                    System.out.println("Successful Update: "+staff.getFirstName());
                
                } else {
                    System.out.println("Failed Update: "+staff.getFirstName());
                
                }
                
                
                } catch(SQLException err){
                    System.err.println(err);
                }
        
        
      
    }
    
}
