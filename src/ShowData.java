import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowData {
    public static void main(String[] args) throws SQLException {
        Connect connect = new Connect();
        Connection conn = connect.connect();
        String query = "SELECT * FROM users";

        Statement stm = null;
        try {
            
            stm = conn.createStatement();

            ResultSet rs = stm.executeQuery(query);

            while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String email = rs.getString("email");
                System.out.println(id + " - " + username + " - " + password + " - " + email);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}

