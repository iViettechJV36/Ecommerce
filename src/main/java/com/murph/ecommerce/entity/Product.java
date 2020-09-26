package com.murph.ecommerce.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Product implements Serializable {

    @Id
    private int productId;
    private String nameProduct;
    private double price;
    private String description;
    @ManyToOne
    @JoinColumn(name = "supplier_name")
    private Supplier supplier;
    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private List<OrderDetails> detailses;

    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
    private List<Image> images;

    public Product() {
    }

    public Product(int productId, String nameProduct, double price, String description, Supplier supplier, Type type, List<OrderDetails> detailses, List<Image> images) {
        this.productId = productId;
        this.nameProduct = nameProduct;
        this.price = price;
        this.description = description;
        this.supplier = supplier;
        this.type = type;
        this.detailses = detailses;
        this.images = images;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<OrderDetails> getDetailses() {
        return detailses;
    }

    public void setDetailses(List<OrderDetails> detailses) {
        this.detailses = detailses;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

}
