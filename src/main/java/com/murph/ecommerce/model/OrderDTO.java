
package com.murph.ecommerce.model;

import java.util.Date;


public class OrderDTO {
    private int orderId;
    private Date orderDate;
    private Date shippedDate;
    private String shipTo;
    private String description;
    private String custommer;
    private String detailses; 

    public OrderDTO() {
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

    public String getCustommer() {
        return custommer;
    }

    public void setCustommer(String custommer) {
        this.custommer = custommer;
    }

    public String getDetailses() {
        return detailses;
    }

    public void setDetailses(String detailses) {
        this.detailses = detailses;
    }
    
    
}
