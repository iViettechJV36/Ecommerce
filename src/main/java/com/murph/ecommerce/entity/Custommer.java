package com.murph.ecommerce.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the custommer database table.
 *
 */
@Entity
public class Custommer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custommerId;

    private String address;

    private String nameCustommer;

    private String phone;

    //bi-directional many-to-one association to Account
    @OneToOne
    @JoinColumn(name = "username")
    private Account account;

    //bi-directional many-to-one association to Account
    //bi-directional many-to-one association to Order
    @OneToMany(mappedBy = "custommer")
    private List<Order> orders;

    public Custommer() {
    }

    public int getCustommerId() {
        return custommerId;
    }

    public void setCustommerId(int custommerId) {
        this.custommerId = custommerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameCustommer() {
        return nameCustommer;
    }

    public void setNameCustommer(String nameCustommer) {
        this.nameCustommer = nameCustommer;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

}
