package com.murph.ecommerce.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the supplier database table.
 *
 */
@Entity
public class Supplier implements Serializable {

    @Id
    private String name;

    private String address;

    private String phone;

    //bi-directional many-to-one association to Product
    @OneToMany(mappedBy = "supplier")
    private List<Product> products;

    public Supplier() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
