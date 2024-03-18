public class Main
{
    public static void main(String[] args) {
        Product pizza = new Product("Pizza", 10.99);
        Product burger = new Product("Burger", 5.99);
        Order order = new Order();
        order.addProduct(pizza);
        order.addProduct(burger);
        Client client = new Client();
        // Registering the client as an observer
        order.addObserver(client);
        System.out.println("Customer order:");
        for (Product product : order.getProducts()) {
            System.out.println("- " + product.getName() + ": $" + product.getPrice());
        }
        order.processOrder();
        // Choosing a delivery strategy
        DeliveryStrategy deliveryStrategy = new CourierDeliveryStrategy();
        order.setDeliveryStrategy(deliveryStrategy);
        // Marking the order as delivered
        order.setState(new DeliveredOrderState(order));
        // Processing the order again to show the state change
        order.processOrder();
        // Delivering the order
        order.deliverOrder();
    }
}