public class Main {
    public static void main(String[] args) {
        OrderProcessor processor = new BasicOrderProcessor();
        InvoiceGenerator invoiceGenerator = new SimpleInvoiceGenerator();
        NotificationService notificationService = new EmailNotificationService();

        OrderManager manager = new OrderManager(processor, invoiceGenerator, notificationService);
        Order order = new Order("John Doe", "123 Main St", "order123", 150.0);
        manager.completeOrder(order);
    }
}
