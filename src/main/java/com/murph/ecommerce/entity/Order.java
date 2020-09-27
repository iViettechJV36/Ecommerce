package com.murph.ecommerce.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the order database table.
 *
 */
@Entity
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    private String description;

    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @Temporal(TemporalType.DATE)
    private Date shippedDATE;

    private String shipto;

    //bi-directional many-to-one association to Custommer
    @ManyToOne
    @JoinColumn(name = "custommerId")
    private Custommer custommer;

    //bi-directional many-to-one association to Orderdetail
    @OneToMany(mappedBy = "order")
    private List<Orderdetail> orderdetails;

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getShippedDATE() {
        return shippedDATE;
    }

    public void setShippedDATE(Date shippedDATE) {
        this.shippedDATE = shippedDATE;
    }

    public String getShipto() {
        return shipto;
    }

    public void setShipto(String shipto) {
        this.shipto = shipto;
    }

    public Custommer getCustommer() {
        return custommer;
    }

    public void setCustommer(Custommer custommer) {
        this.custommer = custommer;
    }

    public List<Orderdetail> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(List<Orderdetail> orderdetails) {
        this.orderdetails = orderdetails;
    }

}
