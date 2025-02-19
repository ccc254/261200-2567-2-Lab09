public class SMSNotifier implements NotificationService {
    @Override
    public void notify(String message) {
        System.out.println("SMS: " + message);
    }
}
