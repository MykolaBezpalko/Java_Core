package task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        mainLogic();
    }

    static void mainLogic() {
        Random random = new Random();
        int size1 = random.nextInt(5 - 1 + 1) + 1;
        int size2 = random.nextInt(5 - 1 + 1) + 1;

        Car[][] cars = new Car[size1][size2];

        for (Car[] row : cars) {
            Arrays.fill(row, new Car(Car.randomHP(), Car.randomYear()));
        }

        boolean flag = true;
        while (flag) {
            System.out.println("Введіть 1 щоб відобразити вмістиме масива Cars.\n" +
                    "Введыть 2 щоб заповнити даний масив дефолтними значеннями.");
            Scanner scanner = new Scanner(System.in);
            int menuItem = scanner.nextInt();
            switch (menuItem) {
                case 1 -> {
                    System.out.println("Створено масив Cars [" + cars.length + "] [" + cars[0].length + "]");
                    System.out.println(Arrays.deepToString(cars));
                }
                case 2 -> {
                    for (Car[] row : cars) {
                        Arrays.fill(row, new Car(999, 999, 999, 999, "ПУСТО"));
                    }
                    System.out.println(Arrays.deepToString(cars));
                    flag = false;
                }
            }
        }
    }
}
