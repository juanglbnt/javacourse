package com.juan.jdbcdemo.mapper;

import com.juan.jdbcdemo.model.Circle;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CircleRowMapper implements RowMapper<Circle> {

    @Override
    public Circle mapRow(ResultSet rs, int rowNum) throws SQLException {
        Circle circle = new Circle();
        circle.setId(rs.getInt("id"));
        circle.setName(rs.getString("name"));
        return circle;
    }
}
