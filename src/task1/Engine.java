package task1;

import java.util.Random;

class Engine {
    int cylinders = randomCylinders();

    int randomCylinders() {
        Random random = new Random();
        int c = random.nextInt(12 - 1 + 1) + 1;
        if (c % 2 == 0) return c;
        else return c + 1;
    }

}
