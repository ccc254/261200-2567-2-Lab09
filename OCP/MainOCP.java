public class MainOCP {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0); // Creating a circle with radius 5.0
        AreaCalculator calculator = new AreaCalculator();
        double area = calculator.calculateArea(circle);
        System.out.println("Circle Area: " + area);



        Rectangle rectangle = new Rectangle(5.0, 5.0); // Creating a circle with radius 5.0
        AreaCalculator calculator2 = new AreaCalculator();
        double area2 = calculator2.calculateArea(rectangle);
        System.out.println("Rectangle Area: " + area2);

        Ellipse ellipse = new Ellipse(5.0, 5.0 ); // Creating a circle with radius 5.0
        AreaCalculator calculator3 = new AreaCalculator();
        double area3 = calculator3.calculateArea(ellipse);
        System.out.println("Rectangle Area: " + area3);

        // ......................................................................... //

    }
}


