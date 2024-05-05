public class SimpleInvoiceGenerator implements InvoiceGenerator {
    @Override
    public void generateInvoice(Order order) {
        System.out.println("Invoice generated for order: " + order.getOrderID());
    }
}
