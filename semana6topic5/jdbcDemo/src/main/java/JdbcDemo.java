import com.juan.jdbcdemo.dao.JdbcDaoImpl;
import com.juan.jdbcdemo.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDemo {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcDaoImpl dao = appContext.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
        Circle circle = dao.getCircle(1);
        System.out.println(circle.getName());

        System.out.println(dao.getCircleCount());
        System.out.println(dao.getCircleName(1));

    }
}
