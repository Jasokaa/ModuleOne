public class Client implements OrderObserver
{
    @Override
    public void update(Order order)
    {
        System.out.println("Order status has been updated.");
    }
    public void placeOrder(Order order)
    {
        order.processOrder();
    }
}