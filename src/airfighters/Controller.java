package airfighters;

import java.util.Random;

public class Controller {
    int distance;

    public void up() {
        Random rand = new Random();
        int distance = rand.nextInt(30);
        System.out.println("Рухаюсь вгору на " + distance + " км.");
    }

    public void down() {
        Random rand = new Random();
        int distance = rand.nextInt(30);
        System.out.println("Рухаюсь вниз на " + distance + " км.");
    }

    public void left() {
        Random rand = new Random();
        int distance = rand.nextInt(500);
        System.out.println("Рухаюсь вліво на " + distance + " км.");
    }

    public void right() {
        Random rand = new Random();
        int distance = rand.nextInt(500);
        System.out.println("Рухаюсь вправо на " + distance + " км.");
    }
}
