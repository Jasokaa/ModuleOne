public class PreparedOrderState implements OrderState
{
    private Order order;
    public PreparedOrderState(Order order)
    {
        this.order = order;
    }
    @Override
    public void processOrder()
    {
        System.out.println("Order prepared. Delivering to customer...");
        order.setState(new DeliveredOrderState(order));
    }
}
