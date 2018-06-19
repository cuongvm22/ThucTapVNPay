/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.Random;

/**
 *
 * @author cuongvm
 */
public class TestJava1 {

    public static void main(String[] args) throws SQLException {
        Connection con = ConnectionDB.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM `order`.`order`");

        int min = new Time(System.currentTimeMillis()).getMinutes();
        while (true) {
            int totalPrice = (int) ((Math.random() * 10) * 100000);
            Date dateCreate = new Date(System.currentTimeMillis());
            Time timeCreate = new Time(System.currentTimeMillis());

            String content = "Thanh toan don hang thoi gian: " + timeCreate + " " + dateCreate;
            String property = null;

            if ((int) (Math.random() * 2) == 2) {
                property = "Da thanh toan";
            } else {
                property = "Da thanh toan";
            }

            if (timeCreate.getMinutes() - min == 1 || timeCreate.getMinutes() - min == -1 ) {
                st.execute("insert into `order`.order (totalPrice, content, dateCreate, property, timeCreate) values \n"
                        + "(" + totalPrice + ", '" + content + "' , '" + dateCreate + "','" + property + "','" + timeCreate + "' );");
               
                System.out.println("Added..." + min);
                 min = new Time(System.currentTimeMillis()).getMinutes();
            }

        }
    }

}
