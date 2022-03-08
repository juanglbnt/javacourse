package com.juan.jdbcdemo.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcDaoImplSupport extends JdbcDaoSupport {

    public int getCircleCount() {
        String sql = "select count(*) from circle";
        return  this.getJdbcTemplate().queryForObject(sql, Integer.class);
    }
}
