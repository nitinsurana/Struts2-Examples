/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nitinsurana.struts2spring3hibernate.dao;

import java.util.List;
import com.nitinsurana.struts2spring3hibernate.models.Customer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nitin
 */
@Repository("customerDao")
public class CustomerDAOImpl extends HibernateDaoSupport implements CustomerDAO {
//public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    public void anyMethodName(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }
    //add the customer

    public void addCustomer(Customer customer) {
        getHibernateTemplate().save(customer);
    }

    //return all the customers in list
    public List<Customer> listCustomer() {
        return getHibernateTemplate().find("from Customer");
    }
}
