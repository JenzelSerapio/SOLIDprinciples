public class BasicOrderProcessor implements OrderProcessor {
    @Override
    public void processOrder(Order order) {
        System.out.println("Order placed for " + order.getCustomerName() + " at " + order.getAddress());
    }
}
