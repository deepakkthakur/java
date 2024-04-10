import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.*;

public class InsertImageJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/JDBCdb", "root", "123456");
            String q = "insert into images(image)values(?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            FileInputStream fis = new FileInputStream("testing.jpg");
            pstmt.setBinaryStream(1, fis, fis.available());
            pstmt.executeUpdate();
            System.out.println("Image uploaded !");
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

    }
}
