package BaiTap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    public static void main(String[] args) {
        ConnectData connectData =  new ConnectData();
        Connection connection = connectData.connect();
        String query = "update products set HangSX = ? , GiaSP = ? where id = ? ";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"ruou tao meo");
            preparedStatement.setString(2,"100000");
            preparedStatement.setInt(3,2);

            int row = preparedStatement.executeUpdate();
            if (row!=0){
                System.out.println("cập nhật thành công: " + row);
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
