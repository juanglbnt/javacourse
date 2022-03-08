import com.juan.jdbcdemo.dao.JdbcDaoImpl;
import com.juan.jdbcdemo.dao.JdbcDaoImplSupport;
import com.juan.jdbcdemo.model.Circle;
import com.juan.jdbcdemo.view.CircleView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcDemo {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcDaoImpl dao = appContext.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
        CircleView view = new CircleView();
        Circle circle = dao.getCircle(1);
        System.out.println(circle.getName());

        System.out.println(dao.getCircleCount());
        System.out.println(dao.getCircleName(1));

        System.out.println(dao.getCircleForId(1));

        //dao.insertCircle(new Circle(2, "second circle"));
        //dao.insertCircleWithNamedParameters(new Circle(4, "fourth circle"));
        //dao.insertCircleWithNamedParameters(new Circle(3, "third circle"));
        System.out.println(dao.getAllCircles().size());
        System.out.println(view.printCircles(dao.getAllCircles()));
        //dao.createTriangleTable();
        JdbcDaoImplSupport jdbcDaoSupport = appContext.getBean("jdbcDaoSupport", JdbcDaoImplSupport.class);
        System.out.println(jdbcDaoSupport.getCircleCount());

    }
}
