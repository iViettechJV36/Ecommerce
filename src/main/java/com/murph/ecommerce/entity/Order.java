
package com.murph.ecommerce.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Order implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    @DateTimeFormat(pattern = "YYYY-MM-dd")
    private Date orderDate;
    @DateTimeFormat(pattern = "YYYY-MM-dd")
    private Date shippedDate;
    private String shipTo;
    private String description;
    @ManyToOne
    @JoinColumn(name = "custommerId")
    private Custommer custommer;
    @OneToMany(mappedBy = "order",fetch = FetchType.EAGER)
    private List<OrderDetails> detailses;

    public Order() {
    }

    public Order(int orderId, Date orderDate, Date shippedDate, String shipTo, String description, List<OrderDetails> detailses, Custommer custommer) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.shippedDate = shippedDate;
        this.shipTo = shipTo;
        this.description = description;
        this.detailses = detailses;
        this.custommer = custommer;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public String getShipTo() {
        return shipTo;
    }

    public void setShipTo(String shipTo) {
        this.shipTo = shipTo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<OrderDetails> getDetailses() {
        return detailses;
    }

    public void setDetailses(List<OrderDetails> detailses) {
        this.detailses = detailses;
    }

    public Custommer getCustommer() {
        return custommer;
    }

    public void setCustommer(Custommer custommer) {
        this.custommer = custommer;
    }
    
    
}
