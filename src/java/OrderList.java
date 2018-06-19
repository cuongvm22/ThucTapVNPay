/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cuongvm
 */
public class OrderList {

    private List orders;

    public static List getOrder(int pageNumber, int pageSize) throws SQLException{
        // connect to DB
        Connection con = ConnectionDB.getConnection("localhost", "order", "root", "admin");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM `order`.`order` order by idorder DESC limit " + (pageNumber- 1) * pageSize + "," + pageSize );
        
        List ordList = new ArrayList();
        while (rs.next()){
            ordList.add(new Order(rs.getInt("idorder"), rs.getInt("totalPrice"), rs.getString("content"), rs.getTime("timeCreate"), rs.getDate("dateCreate"), rs.getString("property")));
        }
        
        con.close();
        return ordList;
    }

  
}
