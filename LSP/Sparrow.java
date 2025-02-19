public class Sparrow implements Flyable {
    @Override
    public void move() {
        System.out.println("Moving...");
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}
