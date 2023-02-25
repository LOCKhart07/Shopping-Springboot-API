package com.lti.shopping.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

@Entity
//@Table(name="orders")
@Table(name = "orders")
public class Orders {
    @Id
    @GenericGenerator(name = "order_sequence", strategy = "increment")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_sequence")
    @Column(name = "id")
    private int id;

    @Column(name = "customer_name")
    private String customer;

    @Column(name = "date_ordered")
    private Date date_ordered;

    @Column(name = "status")
    private Boolean complete;


    public Orders(int id, String customer, Date date_ordered, Boolean complete) {
        this.id = id;
        this.customer = customer;
        this.date_ordered = date_ordered;
        this.complete = complete;
    }

    public Orders(){
        super();
    }
    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id + "customer=" + customer + "date_ordered=" + date_ordered +
                ", complete='" + complete + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Date getDate_ordered() {
        return date_ordered;
    }

    public void setDate_ordered(Date date_ordered) {
        this.date_ordered = date_ordered;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }



}
