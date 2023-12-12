import java.beans.Statement;
import java.sql.*;

class ConnectDB{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.().jdbc.Driver");
            Connection con = DatabaseManager.getConnection("DB-URL", "DB-USERNAME", "DB-PASSWORD");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELRCT * FROM TABLE_NAME");
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}