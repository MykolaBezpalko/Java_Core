package figures;

public class Circle {

    static double Pi = 3.14;
    public double diameter;
    public double radius;

    public Circle(double diameter) {
        this.diameter = diameter;
        this.radius = diameter / 2;
    }

    public double square(double diameter) {
//        return Pi * Math.pow(diameter / 2, 2);
        return Pi * (diameter / 2) * (diameter / 2);
    }

    public double length(double radius) {
        return 2 * Pi * radius;
    }
}
