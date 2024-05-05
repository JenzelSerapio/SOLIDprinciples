public class Order {
    private String customerName;
    private String address;
    private String orderID;
    private double total;

    public Order(String customerName, String address, String orderID, double total) {
        this.customerName = customerName;
        this.address = address;
        this.orderID = orderID;
        this.total = total;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public String getOrderID() {
        return orderID;
    }

    public double getTotal() {
        return total;
    }
}

