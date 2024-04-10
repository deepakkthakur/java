
import java.sql.*;

public class MyConnection {
    private Connection con = null;
    private Statement st;

    public Connection getConnection(String db) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db, "root", "123456");

            return con;
        } catch (Exception e) {

            System.out.println("error");
            return null;
        }

    }

    public void disconnect() {

        try {
            this.con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ResultSet getResultSet(String qry, String db) {
        ResultSet resultSet = null;
        try {
            st = this.getConnection(db).createStatement();
            resultSet = st.executeQuery(qry);
            // this.disconnect();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return resultSet;

    }

}
