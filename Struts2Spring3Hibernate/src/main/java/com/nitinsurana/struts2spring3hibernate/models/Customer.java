/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nitinsurana.struts2spring3hibernate.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Nitin
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idcustomer", unique = true, nullable = false)
    private Integer idcustomer;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "createdDate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date createdDate;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(Integer idcustomer) {
        this.idcustomer = idcustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
