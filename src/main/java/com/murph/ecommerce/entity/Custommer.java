package com.murph.ecommerce.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Custommer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custommerId;
    private String nameCustommer;
    private String phone;
    private String address;
    @OneToOne
    @JoinColumn(name ="user-name" )
    private Account account;
    @OneToMany(mappedBy = "custommer", fetch = FetchType.LAZY)
    private List<Order> orders;
    

    public int getCustommerId() {
        return custommerId;
    }

    public void setCustommerId(int custommerId) {
        this.custommerId = custommerId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
}