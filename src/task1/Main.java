package task1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        mainLogic();
    }

    static void mainLogic() {
        Random random = new Random();
        int size1 = random.nextInt(5 - 1 + 1) + 1;
        int size2 = random.nextInt(5 - 1 + 1) + 1;


        ArrayList carsList = new ArrayList();
        ArrayList<Car> inner = new ArrayList<Car>();
        for (int i = 0; i < size1; i++) {
            carsList.add(inner);
        }
        for (int j = 0; j < size2; j++) {
            Car model = new Car(Car.randomHP(), Car.randomYear());
            inner.add(model);
        }
        boolean flag = true;
        while (flag) {
            System.out.println("Введіть 1 щоб відобразити вмістиме масива Cars.\n" +
                    "Введыть 2 щоб заповнити даний масив дефолтними значеннями.");
            Scanner scanner = new Scanner(System.in);
            int menuItem = scanner.nextInt();
            switch (menuItem) {
                case 1 -> {
                    System.out.println("Створено масив Cars [" + carsList.size() + "]" +
                            "[" + inner.size() + "]");
                    System.out.println(carsList);
                    carsList.clear();
                    inner.clear();
                }
                case 2 -> {
                    for (int i = 0; i < size1; i++) {
                        carsList.add(inner);
                    }
                    for (int j = 0; j < size2; j++) {
                        Car model = new Car(999, 999, 999, 999, "ПУСТО");
                        inner.add(model);
                    }
                    System.out.println(carsList);
                    flag = false;
                }
            }
        }
    }
}
