public class SelfPickupStrategy implements DeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("Please pick up your order at the restaurant.");
    }
}
