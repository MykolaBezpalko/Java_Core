package task1;

import java.util.Random;

public class Car {
    int HP;
    int year;
    public SteeringWheel wheel = new SteeringWheel();
    public Engine engine = new Engine();

    public Car(int HP, int year) {
        this.HP = HP;
        this.year = year;
    }

    public Car(int HP, int year, int cylinders, int diameter, String s) {
        this.year = year;
        this.HP = HP;
        engine.cylinders = cylinders;
        wheel.diameter = diameter;
        wheel.material = s;
    }

    static int randomHP() {
        Random random = new Random();
        return random.nextInt(500 - 80 + 1) + 80;
    }

    static int randomYear() {
        Random random = new Random();
        return random.nextInt(2021 - 1935 + 1) + 1935;
    }

    @Override
    public String toString() {
        return "\nCar{ " +
                "Кінських сил: " + HP +
                ", Pік випуску: " + year +
                ", Циліндрів: " + engine.cylinders +
                ", Діаметр керма: " + wheel.diameter + " cm." +
                ", Матеріал керма: " + wheel.material + "," + '}' + "\n";
    }


}
