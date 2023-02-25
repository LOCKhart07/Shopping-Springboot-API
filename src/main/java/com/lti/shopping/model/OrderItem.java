package com.lti.shopping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orderItem")
public class OrderItem {
//    values as per db schema designed
    private String item_name;
    private String order;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "orderId" )
    private OrderItem orderItem;
    public OrderItem(String item_name, String order, int quantity, OrderItem orderItem ){
        this.item_name=item_name;
        this.order=order;
        this.quantity=quantity;
        this.orderItem = orderItem;
    }

    public OrderItem(String item_name, String order, int quantity) {
        super();
        this.item_name = item_name;
        this.order = order;
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "OrderItem{" +
                "item_name=" + item_name + "quantity=" + quantity +
                ", order='" + order + '\'' +
                '}';
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }
}
