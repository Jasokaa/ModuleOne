import java.util.ArrayList;
import java.util.List;
public class Order {
    private List<Product> products = new ArrayList<>();
    private OrderState state;
    private List<OrderObserver> observers = new ArrayList<>();
    private DeliveryStrategy deliveryStrategy;

    public Order() {
        this.state = new NewOrderState(this);
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void processOrder() {
        state.processOrder();
        notifyObservers();
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }
    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }
    public void deliverOrder() {
        if (deliveryStrategy == null) {
            System.out.println("Please set a delivery strategy before delivering the order.");
            return;
        }
        deliveryStrategy.deliver();
    }
}