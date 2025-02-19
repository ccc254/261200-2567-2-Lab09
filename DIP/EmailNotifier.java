public class EmailNotifier implements NotificationService {
    @Override
    public void notify(String message) {
        System.out.println("Email: " + message);
    }
}
