package com.murph.ecommerce;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the orderdetails database table.
 *
 */
@Entity
@Table(name = "orderdetails")
public class Orderdetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int detailsId;

    private int orderDetailsId;

    private int quantity;

    //bi-directional many-to-one association to Order
    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;

    //bi-directional many-to-one association to Product
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    public Orderdetail() {
    }

    public int getDetailsId() {
        return this.detailsId;
    }

    public void setDetailsId(int detailsId) {
        this.detailsId = detailsId;
    }

    public int getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(int orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    
}
