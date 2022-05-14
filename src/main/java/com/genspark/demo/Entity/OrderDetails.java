package com.genspark.demo.Entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(indexes = @Index(name = "uniqueIndex2", columnList = "orderId"))

public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "orderId", nullable = false,
            foreignKey = @ForeignKey(name = "ORDER_DETAIL_ORD_FK"))
    private Orders order;
    @ManyToOne
    @JoinColumn(name = "productId", nullable = false,
            foreignKey = @ForeignKey(name = "ORDER_DETAIL_PRD_FK"))
    private Product product;
    @NotNull
    private float Price;
    @NotNull
    private int quantity;

    public OrderDetails() {
    }

    public OrderDetails(Orders order, Product product, float price, int quantity) {
        this.order = order;
        this.product = product;
        Price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }



    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "id=" + id +
                ", order=" + order +
                ", product=" + product +
                ", Price=" + Price +
                ", quantity=" + quantity +
                '}';
    }
}
