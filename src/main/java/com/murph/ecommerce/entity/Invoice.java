package com.murph.ecommerce.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * The persistent class for the order database table.
 *
 */
@Entity
public class Invoice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int invoiceId;
    @DateTimeFormat(pattern = "YYYY-MM-dd")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date invoiceDate;
    @DateTimeFormat(pattern = "YYYY-MM-dd")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date shippedDATE;
    private String shipto;
    private String description;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    @OneToMany(mappedBy = "invoice")
    private List<LineItem> lineItems;

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

}
