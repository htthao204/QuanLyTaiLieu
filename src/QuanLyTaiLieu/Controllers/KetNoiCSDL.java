package QuanLyTaiLieu.Controllers;

import java.sql.Connection;
import java.sql.DriverManager;

public class KetNoiCSDL {
    protected Connection conn=null;
        public KetNoiCSDL()
        {
            try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String username="sa";
            String password="12345";
            String dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=QUANLYTAILIEU;encrypt=false";
            conn=DriverManager.getConnection(dbUrl,username, password);
            System.out.println("Ket noi thanh cong");
            } catch (Exception ex) {
                 System.out.println("Loi"+ex.getMessage());
            }
       
             } 
}
