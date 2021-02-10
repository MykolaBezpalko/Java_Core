import figures.*;
import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(3, 5);

        Circle circle1 = new Circle(8.4);
        Circle circle2 = new Circle(6.2);

        System.out.println("Площа прямокутника №1 = " + rect1.square(rect1.width, rect1.height) + " см.");
        System.out.println("Периметр прямокутника №1 = " + rect1.perimeter(rect1.width, rect1.height) + " см.");

        System.out.println();
        System.out.println("Площа прямокутника №1 = " + rect2.square(rect2.width, rect2.height) + " см.");
        System.out.println("Периметр прямокутника №1 = " + rect2.perimeter(rect2.width, rect2.height) + " см.");

        System.out.println();
        System.out.println("Площа кола №1 = " + circle1.square(circle1.diameter) + " см.");
        System.out.println("Довжина кола №1 = " + circle1.length(circle1.radius) + " см.");

        System.out.println();
        System.out.println("Площа кола №2 = " + circle2.square(circle2.diameter) + " см.");
        System.out.println("Довжина кола №2 = " + circle2.length(circle2.radius) + " см.");
    }
}
