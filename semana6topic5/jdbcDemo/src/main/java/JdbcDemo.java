import com.juan.jdbcdemo.DAO.JdbcDaoImpl;
import com.juan.jdbcdemo.model.Circle;

public class JdbcDemo {

    public static void main(String[] args) {

        Circle circle = new JdbcDaoImpl().getCircle(1);
        System.out.println(circle.getName());

    }
}
