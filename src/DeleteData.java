import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
    public static void main(String[] args) {
        Connect connect = new Connect();
        Connection conn = connect.connect();

        String query = "DELETE FROM users WHERE id = 5";

        try {
            Statement sttm  = null;
            sttm = conn.createStatement();
            int row = sttm.executeUpdate(query);
            if (row!=0){
                System.out.println("xóa thành công: " + row);
            }
            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
