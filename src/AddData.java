import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddData {
    public static void main(String[] args) {
        Connect connect = new Connect();
        Connection conn = connect.connect();
        String query = "insert into users (id,username,password,email)" + "values (?,?,?,?)";

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conn.prepareStatement(query);

            preparedStatement.setInt(1,2);
            preparedStatement.setString(2,"ha thanh tinh " );
            preparedStatement.setString(3,"2" );
            preparedStatement.setString(4,"ha thanh tinh " );

            int row = preparedStatement.executeUpdate();
            if (row!=0) {
                System.out.println("complete " + row);
            }
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
