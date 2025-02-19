public class Penguin implements Flyable{
    @Override
    public void move() {
        System.out.println("Moving...");
    }
    @Override
    public void fly() {
        System.out.println("Not Flying...");
    }
}
