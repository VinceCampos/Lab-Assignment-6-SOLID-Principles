public class OrderTest {

    public static void main(String[] args) {

        GenerateOrder order = new OrderAction();
        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        GenerateInterface generate = new OrderAction();
        generate.generateInvoice("order_123.pdf");

        Sendable send = new OrderAction();
        send.sendEmailNotification("johndoe@example.com");

    }
  }