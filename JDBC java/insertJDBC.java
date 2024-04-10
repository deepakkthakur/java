import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.io.*;

public class insertJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/JDBCdb", "root", "123456");
            String q = "insert into student(stu_name,age,city)values(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Name");
            String name = br.readLine();
            System.out.println("Enter Age");
            String age = br.readLine();
            System.out.println("Enter City");
            String city = br.readLine();
            pstmt.setString(1, name);
            pstmt.setString(2, age);
            pstmt.setString(3, city);

            // pstmt.setString(1, "Deepak Thakur");
            // pstmt.setString(2, "27");
            // pstmt.setString(3, "Giridih");
            pstmt.executeUpdate();
            System.out.println("Data inserted");

        } catch (Exception e) {
            System.out.println(e.getStackTrace());

        }
    }
}
