package com.murph.ecommerce.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the type database table.
 *
 */
@Entity
public class Type implements Serializable {


    @Id
    private int typeId;

    private String typeName;

    //bi-directional many-to-one association to Product
    @OneToMany(mappedBy = "type")
    private List<Product> products;

    public Type() {
    }

    public int getTypeId() {
        return this.typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
