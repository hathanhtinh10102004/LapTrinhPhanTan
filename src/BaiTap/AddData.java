package BaiTap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddData {
    public static void main(String[] args) throws SQLException {
        ConnectData connectData = new ConnectData();
        Connection connection = connectData.connect();
        String query = "insert into products (id,TenSP,GiaSP,ChiTietSP,HangSX,SoLuongSP,TrangThai)" + "values (?,?,?,?,?,?,?)";

        PreparedStatement preparedStatement = null;
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,2);
        preparedStatement.setString(2,"tra sua");
        preparedStatement.setString(3,"300000");
        preparedStatement.setString(4,"hang chau au");
        preparedStatement.setString(5,"HTTngao");
        preparedStatement.setInt(6,30);
        preparedStatement.setBoolean(7,true);

        int row = preparedStatement.executeUpdate();
        if (row!=0){
            System.out.println("Add thành công: " + row);
        }
         connection.close();
    }
}
