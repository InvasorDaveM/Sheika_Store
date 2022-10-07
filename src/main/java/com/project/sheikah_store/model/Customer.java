package com.project.sheikah_store.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_customer", nullable = false)
    private String name;

    @Column(name = "birthdate", nullable = false)
    private String birthdate;

    @Column(name = "email", nullable = false)
    private String email;

    /*
     * @OnetoOne
     * 
     * @MapsId
     * private Account account;
     */

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "code_account", referencedColumnName = "code_account")
    private Account accountFK;

    public Customer() {
    }

    public Customer(Integer id, String name, String birthdate, String email, Account accountFK) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.email = email;
        this.accountFK = accountFK;
        // this.account.setCustomer(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account getAccountFK() {
        return accountFK;
    }

    public void setAccountFK(Account accountFK) {
        this.accountFK = accountFK;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", birthdate=" + birthdate + ", email=" + email + ", account="
                + accountFK + "]";
    }

}
