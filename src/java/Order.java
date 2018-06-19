/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author cuongvm
 */
public class Order {

    private int id;
    private int totalPrice;
    private String content;
    private String property;
    private Time timeCreate;
    private Date dateCreate;

    public Order() {
        this.id = 0;
        this.totalPrice = 0;
        this.content = "N/A";
        this.property = "N/A";
        this.timeCreate = new Time(0, 0, 0);
        this.dateCreate = new Date(0000, 00, 00);
    }

    public Order(int id, int totalPrice, String content, Time timeCreate, Date dateCreate, String property) {
        this.id = id;
        this.totalPrice = totalPrice;
        this.content = content;
        this.timeCreate = timeCreate;
        this.dateCreate = dateCreate;
        this.property = property;
    }

    public int getId() {
        return id;
    }

    public Time getTimeCreate() {
        return timeCreate;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public String getContent() {
        return content;
    }

    public Date getDateCreate() {
        return dateCreate;
    }
    public String getProperty(){
        return this.property;
    }
    
    
}
