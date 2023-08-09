package BaiTap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectData {
    private String hostName = "localhost:3306";
    private String dbName = "JDBCForJava";
    private String username = "root";
    private String password = "2004";

    private String connectionURL = "jdbc:mysql://"+hostName+"/"+dbName;

    public Connection connect(){
        //Tạo đối tượng Connection
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(connectionURL, username, password);
            System.out.println("Kết nối thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

    public static void main(String[] args) {
        ConnectData connect = new ConnectData();
        connect.connect();
    }

}
