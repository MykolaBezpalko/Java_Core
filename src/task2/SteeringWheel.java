package task2;

import java.util.Random;

class SteeringWheel {
    public int diameter = randomDiameter();
    String material = randomMaterial();

    int randomDiameter() {
        Random random = new Random();
        return random.nextInt(43 - 31 + 1) + 31;
    }

    String randomMaterial() {
        Random random = new Random();
        int r = random.nextInt(6 - 1 + 1) + 1;
        return switch (r) {
            case 1 -> "Автомобільна шкіра";
            case 2 -> "Алькантара";
            case 3 -> "Замінник шкіри";
            case 4 -> "Пластик і резина";
            case 5 -> "Локоване дерево";
            case 6 -> "Комбіновані матеріали";
            default -> "Не було співпадінь.Випадкове значення змінної " + r;
        };
    }


}
