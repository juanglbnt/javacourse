package com.juan.jdbcdemo.dao;

import com.juan.jdbcdemo.mapper.CircleRowMapper;
import com.juan.jdbcdemo.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

@Component
public class JdbcDaoImpl {

    @Autowired
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate = new JdbcTemplate();
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public Circle getCircle(int circleId) {
        Connection connection = null;
        try {
            //este apartado queda cubierto en el spring.xml
            /*String driver = "org.apache.derby.jdbc.ClientDriver";
            Class.forName(driver).getDeclaredConstructor().newInstance();*/
            connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement("select * from circle where id = ?");
            ps.setInt(1, circleId);

            Circle circle = null;
            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                circle = new Circle(circleId, rs.getString("name"));
            }
            rs.close();
            ps.close();
            return circle;

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }  finally {

            try {
                connection.close();
            } catch (SQLException sqlEx) {
                System.out.println(sqlEx);
            }
        }
    }

    public int getCircleCount() {
        String sql = "select count(*) from circle";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    public String getCircleName(int circleId) {
        String sql = "select name from circle where id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[] {circleId}, String.class);
    }

    public Circle getCircleForId(int circleId) {
        String sql = "select * from circle where id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[] {circleId}, new CircleRowMapper());
    }

    public List<Circle> getAllCircles() {
        String sql = "select * from circle";
        return jdbcTemplate.query(sql, new CircleRowMapper());
    }

    public void insertCircle(Circle circle) {
        String sql = "insert into circle (id, name) values (?, ?)";
        jdbcTemplate.update(sql, new Object[] {circle.getId(), circle.getName()});

    }

    public void insertCircleWithNamedParameters(Circle circle) {
        String sql = "insert into circle (id, name) values(:id, :name)";
        SqlParameterSource namedParameters = new MapSqlParameterSource("id", circle.getId())
                .addValue("name", circle.getName());

        namedParameterJdbcTemplate.update(sql, namedParameters);

    }

    public void createTriangleTable() {
        String sql = "create table triangle (id integer, name varchar(50))";
        jdbcTemplate.execute(sql);
    }

    //getters and setters
    public DataSource getDataSource() {
        return dataSource;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
