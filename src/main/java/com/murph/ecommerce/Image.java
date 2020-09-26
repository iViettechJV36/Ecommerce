package com.murph.ecommerce;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the image database table.
 *
 */
@Entity
public class Image implements Serializable {

    private static final long serialVersionUID = 1L;

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
