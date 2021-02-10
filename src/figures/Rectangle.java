package figures;

public class Rectangle {


    public Rectangle() {
        width = 10;
        height = 10;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int width;
    public int height;

    public int square(int width, int height) {
        return width * height;
    }

    public int perimeter(int width, int height) {
        return (width * 2) + (height * 2);
    }
}
