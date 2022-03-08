package com.juan.jdbcdemo.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.management.Query;

@Repository
public class HibernateDaoImpl {

    @Autowired
    private SessionFactory sessionFactory;

    public int getCircleCount() {
        String sql = "select count(*) from circle";
        Query query = sessionFactory.openSession().createQuery(sql);
    }
}
