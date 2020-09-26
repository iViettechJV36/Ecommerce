
package com.murph.ecommerce.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account implements Serializable{
    @Id
    @Column(name = "user-name")
    private String userName;
    private String password;
    @OneToOne(mappedBy = "account")
    private Custommer custommer;
    @OneToOne(mappedBy = "accountRole")
    private Role role;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Custommer getCustommer() {
        return custommer;
    }

    public void setCustommer(Custommer custommer) {
        this.custommer = custommer;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
}
