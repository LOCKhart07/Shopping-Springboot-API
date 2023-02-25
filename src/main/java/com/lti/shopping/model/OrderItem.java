package com.lti.shopping.model;

import jakarta.persistence.*;

@Entity
@Table(name = "order_item")
public class OrderItem {
    //    values as per db schema designed
    @Column(name = "item_name")
    private String itemName;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders order;

    public OrderItem(String itemName, Orders order, int quantity) {
        super();
        this.itemName = itemName;
        this.order = order;
        this.quantity = quantity;
    }

    public OrderItem() {
        super();
    }

    @Override
    public String toString() {
        return "OrderItem{" + "item_name=" + itemName + "quantity=" + quantity + ", order='" + order + '\'' + '}';
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }
}
