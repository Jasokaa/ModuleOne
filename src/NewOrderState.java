public class NewOrderState implements OrderState
{
    private Order order;
    public NewOrderState(Order order)
    {
        this.order = order;
    }
    @Override
    public void processOrder()
    {
        System.out.println("Order placed. Waiting for confirmation...");
        order.setState(new ConfirmedOrderState(order));
    }
}
