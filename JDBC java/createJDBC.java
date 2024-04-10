import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class createJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/jdbcdb", "root", "123456");
            String q = "create table student(stu_id int(20) auto_increment primary key, stu_name varchar(50) not null, age varchar(3), city varchar(100) not null)";
            Statement result = con.createStatement();
            result.executeUpdate(q);
            System.out.println("table created in database");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
