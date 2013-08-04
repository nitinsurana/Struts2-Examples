/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nitinsurana.struts2spring3hibernate.dao;

import java.util.List;
import com.nitinsurana.struts2spring3hibernate.models.Customer;

/**
 *
 * @author Nitin
 */
public interface CustomerDAO {

    void addCustomer(Customer customer);

    List<Customer> listCustomer();
}
