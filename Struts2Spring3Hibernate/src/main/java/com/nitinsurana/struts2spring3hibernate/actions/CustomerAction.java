/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nitinsurana.struts2spring3hibernate.actions;

import com.opensymphony.xwork2.ModelDriven;
import com.nitinsurana.struts2spring3hibernate.dao.CustomerDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.nitinsurana.struts2spring3hibernate.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Nitin
 */
//The Struts2 action is no longer need to extends the ActionSupport, Spring will handle it.
@Component
public class CustomerAction implements ModelDriven {

    Customer customer = new Customer();
    List<Customer> customerList = new ArrayList<Customer>();
    @Autowired
    CustomerDAO customerDAO;

    public Object getModel() {
        return customer;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
    //save customer

    public String addCustomer() throws Exception {
        //save it
        customer.setCreatedDate(new Date());
        customerDAO.addCustomer(customer);

        //reload the customer list
        customerList = null;
        customerList = customerDAO.listCustomer();

        return "success";

    }

    public String listCustomer() throws Exception {
        customerList = customerDAO.listCustomer();
        return "success";

    }
}
