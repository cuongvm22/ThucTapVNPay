
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cuongvm
 */
public class CountRecord {
    public static int getCountRecord() throws SQLException{
        int count = 1;
        Connection con = ConnectionDB.getConnection("loacalhost", "order", "root", "admin");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select count(idorder) from `order`.order");
        while (rs.next())
            count = rs.getInt("count(idorder)");
        
        con.close();
        return count;
    }
}
