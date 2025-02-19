public class Ellipse extends Shape {

    private double width, height;
    public Ellipse(double width, double height) {
        this.width = width;
        this.height = height;

    }
    @Override
    public double calculateArea() {
        return Math.PI * this.width * height;
    }
}
