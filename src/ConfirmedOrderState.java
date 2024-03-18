public class ConfirmedOrderState implements OrderState
{
    private Order order;
    public ConfirmedOrderState(Order order)
    {
        this.order = order;
    }
    @Override
    public void processOrder()
    {
        System.out.println("Order confirmed. Preparing food...");
        order.setState(new PreparedOrderState(order));
    }
}
