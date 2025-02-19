public class MainLSP {
    public static void main(String[] args) {

        Penguin penguin = new Penguin();
        System.out.println("--Penguin--");
        penguin.move();
        penguin.fly();

        Sparrow sparrow = new Sparrow();
        System.out.println("--Sparrow--");
        sparrow.move();
        sparrow.fly();

        Ostrich ostrich = new Ostrich();
        System.out.println("--Ostrich--");
        ostrich.move();
        ostrich.fly();

        Eagle eagle = new Eagle();
        System.out.println("--Eagle--");
        eagle.move();
        eagle.fly();

    }
}
