/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nitinsurana.struts2spring3hibernate.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public abstract class CustomHibernateDaoSupport extends HibernateDaoSupport {

    @Autowired
    public void anyMethodName(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }
}
