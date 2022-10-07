package com.project.sheikah_store.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "server_account")
public class Account {

    @Id
    @Column(name = "code_account", nullable = false)
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;

    @Column(name = "user_account", nullable = false)
    private String user;

    @Column(name = "password_account", nullable = false)
    private String password;

    @Column(name = "type_account", nullable = false)
    String type;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "accountFK")
    // @PrimaryKeyJoinColumn
    private Customer customer;

    public Account() {
    }

    public Account(Integer code, String user, String password, String type, Customer customer) {
        this.code = code;
        this.user = user;
        this.password = password;
        this.type = type;
        this.customer = customer;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Account [code=" + code + ", user=" + user + ", password=" + password + ", type=" + type + ", customer="
                + customer + "]";
    }

}
