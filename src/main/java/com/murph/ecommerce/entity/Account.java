package com.murph.ecommerce.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the account database table.
 *
 */
@Entity
public class Account implements Serializable {

    @Id
    private String username;

    private String password;

    //bi-directional many-to-one association to Custommer
    @OneToOne(mappedBy = "account")
    private Customer customer;

    //bi-directional many-to-one association to Role
    @OneToOne(mappedBy = "account")
    private Role role;

    public Account() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer custommer) {
        this.customer = custommer;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
