import java.sql.*;

public class test_connection {
    public static void main(String[] args) {




    String url="";
try {
    Connection con = DriverManager.getConnection(url,"hr",hr);
    System.out.println("Connection successful");
}catch(SQLException e){
    System.out.println("Connection has failed" + e.getMessage());
}









}
}