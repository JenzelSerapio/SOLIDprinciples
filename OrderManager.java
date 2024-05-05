public class OrderManager {
    private OrderProcessor processor;
    private InvoiceGenerator invoiceGenerator;
    private NotificationService notificationService;

    public OrderManager(OrderProcessor processor, InvoiceGenerator invoiceGenerator, NotificationService notificationService) {
        this.processor = processor;
        this.invoiceGenerator = invoiceGenerator;
        this.notificationService = notificationService;
    }

    public void completeOrder(Order order) {
        processor.processOrder(order);
        invoiceGenerator.generateInvoice(order);
        notificationService.sendNotification("Your order has been processed.", order.getCustomerName());
    }
}

