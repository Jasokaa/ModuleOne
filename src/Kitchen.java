public class Kitchen
{
    public void prepareOrder(Order order)
    {
        System.out.println("Kitchen is preparing the order...");
        order.processOrder();
    }
}