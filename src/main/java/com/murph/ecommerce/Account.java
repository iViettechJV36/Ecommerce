package com.murph.ecommerce;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

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
    @OneToMany(mappedBy = "account", fetch = FetchType.EAGER)
    private List<Custommer> custommers;

    //bi-directional many-to-one association to Role
    @OneToMany(mappedBy = "account", fetch = FetchType.EAGER)
    private List<Role> roles;

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

    public List<Custommer> getCustommers() {
        return custommers;
    }

    public void setCustommers(List<Custommer> custommers) {
        this.custommers = custommers;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

}
