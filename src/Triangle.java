public class Triangle extends Shape implements java.io.Serializable {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double s = calculateCircumference() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double calculateCircumference() {
        return a + b + c;
    }

    public String getClassName() {
        return "Triangle";
    }
}
