public class DeliveredOrderState implements OrderState
{
    private Order order;
    public DeliveredOrderState(Order order)
    {
        this.order = order;
    }
    @Override
    public void processOrder()
    {
        System.out.println("Order delivered. Enjoy your meal!");
    }
}
