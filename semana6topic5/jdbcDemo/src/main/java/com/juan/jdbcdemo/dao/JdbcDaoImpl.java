package com.juan.jdbcdemo.dao;

import com.juan.jdbcdemo.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;

@Component
public class JdbcDaoImpl {

    @Autowired
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

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
}
