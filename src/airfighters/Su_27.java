package airfighters;

import java.util.Random;

public class Su_27 extends Plane implements SpecialOptions {
    public String color;
    int maxSpeed;

    public Su_27(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void turboAcceleration() {
        Random rand = new Random();
        int turboSpeed = rand.nextInt();
        while (turboSpeed > 2500 || turboSpeed <= maxSpeed) {
            turboSpeed = rand.nextInt();
        }
        System.out.println("Швидкість прискорення Су-27 " + turboSpeed + " км./год.");
    }

    @Override
    public void stealthTechnology() {
        Random rand = new Random();
        int invisibleTime = rand.nextInt(600);
        System.out.println("Вмикаю Stealth - працватиме протягом " + invisibleTime + " секунд.");

    }

    @Override
    public void nuclearStrike() {
        Random rand = new Random();
        int bombs = rand.nextInt(9) + 1;
        System.out.println("Буде скинутно " + bombs + " ядерних боєголовок при ударі.");
    }

    @Override
    public void engineLaunch() {
        Random rand = new Random();
        int launchTime = 20 + rand.nextInt(88 - 20 + 1);
        System.out.println("Старт двигуна займе " + launchTime + " секунд.");
    }

    @Override
    public void planeRise() {
        Random rand = new Random();
        int distance = rand.nextInt(1000);
        System.out.println("Літак пролениить " + distance + " км. на повному баку.");
    }
}
