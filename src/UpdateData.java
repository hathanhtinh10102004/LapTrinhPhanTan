import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void main(String[] args) {
        Connect connect = new Connect();
        Connection conn = connect.connect();

        String query = "UPDATE users SET password = ? WHERE id = ?";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = conn.prepareStatement(query);

            preparedStatement.setString(1,"thanhtinh123");
            preparedStatement.setInt(2,3);
            int row = preparedStatement.executeUpdate();
            if (row!=0){
                System.out.println("capapj nhật thanh công: " + row);
            }

            // đóng kết nối
            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
