package com.murph.ecommerce.entity;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Image implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameImage;

    //bi-directional many-to-one association to Product
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    //bi-directional many-to-one association to Product
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameImage() {
        return nameImage;
    }

    public void setNameImage(String nameImage) {
        this.nameImage = nameImage;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Image() {
    }

}
