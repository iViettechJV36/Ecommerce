package com.murph.ecommerce;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the product database table.
 *
 */
@Entity

public class Product implements Serializable {

    @Id

    private int productId;

    private String description;

    private String productName;

    private double price;

    //bi-directional many-to-one association to Image
    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
    private List<Image> images;

    //bi-directional many-to-one association to Orderdetail
    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
    private List<Orderdetail> orderdetails;

    //bi-directional many-to-one association to Supplier
    @ManyToOne
    private Supplier supplier;

    //bi-directional many-to-one association to Type
    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

    public Product() {
    }

    public int getProductId() {
        return this.productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Orderdetail> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(List<Orderdetail> orderdetails) {
        this.orderdetails = orderdetails;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
