import java.sql.*;

class Demo {
    public static void main(String args[]) {
        try {
            // step1 load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/vtpl-website", "root", "123456");
            if (con.isClosed()) {
                System.out.println("Connection is closed");
            } else {
                System.out.println("Connection dranted !");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}