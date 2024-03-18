import java.util.ArrayList;
import java.util.List;
public class Waiter {
    private List<Order> orders = new ArrayList<>();
    public void takeOrder(Order order) {
        orders.add(order);
    }
    public void passToKitchen() {
        for (Order order : orders) {
            order.processOrder();
        }
    }
}
