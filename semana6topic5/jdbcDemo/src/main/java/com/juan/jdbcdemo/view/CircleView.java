package com.juan.jdbcdemo.view;

import com.juan.jdbcdemo.dao.JdbcDaoImpl;
import com.juan.jdbcdemo.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CircleView {

    ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
    JdbcDaoImpl dao = appContext.getBean("jdbcDaoImpl", JdbcDaoImpl.class);

    public CircleView() {

    }

    public String printCircles(List<Circle> circles) {
        String listOfCircles = "";

        for(Circle circle : circles) {
            listOfCircles += "id: [" + circle.getId() + "]\n"
                           + "name: [" + circle.getName() + "]\n"
                           + "---------------------\n";
        }

        return listOfCircles;
    }
}
