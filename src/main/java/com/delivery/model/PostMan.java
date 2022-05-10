package com.delivery.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PostMan {

    // Declare variables with annotations for table columns
    @Id
    private String id;
    private String orderid;
    private String price;
    private String status;

    // Implement default constructor
    public PostMan() {
    }

    // Implement overload constructor
    public PostMan(String id, String orderid, String price, String status) {
        this.id = id;
        this.orderid = orderid;
        this.price = price;
        this.status = status;
    }

    // To String
    @Override
    public String toString() {
        return "PostMan{" +
                "id=" + id +
                ", orderid='" + orderid + '\'' +
                ", price='" + price + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    // Implement Getter & Setter for variables
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}