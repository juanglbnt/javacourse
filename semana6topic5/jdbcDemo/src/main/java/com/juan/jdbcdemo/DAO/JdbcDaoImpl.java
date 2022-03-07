package com.juan.jdbcdemo.DAO;

import com.juan.jdbcdemo.model.Circle;

import java.sql.*;

public class JdbcDaoImpl {

    public Circle getCircle(int circleId) {

        Connection connection = null;
        try {
            String driver = "org.apache.derby.jdbc.ClientDriver";
            Class.forName(driver).getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/db");
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
}
