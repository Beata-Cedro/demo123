import com.borychowska.api.IOrder;
import com.borychowska.conf.Config;
import com.borychowska.implement.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        IOrder order = context.getBean(Order.class);
        order.printOrder();

    }
}
