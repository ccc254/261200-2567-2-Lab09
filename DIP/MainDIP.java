public class MainDIP {
    public static void main(String[] args) {

        OrderProcessor orderProcessor = new OrderProcessor(new EmailNotifier());
        orderProcessor.processOrder(new Order());
        OrderProcessor orderProcessor2 = new OrderProcessor(new SMSNotifier());
        orderProcessor2.processOrder(new Order());
    }
}
