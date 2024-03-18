public class CourierDeliveryStrategy implements DeliveryStrategy
{
    @Override
    public void deliver()
    {
        System.out.println("Your order is being delivered by a courier.");
    }
}
