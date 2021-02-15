import airfighters.Controller;
import airfighters.Su_27;

public class Main {
    public static void main(String[] args) {
        Su_27 su27 = new Su_27("Білий", 1500);

        System.out.println("Використання літака Су-27. Колір - " + su27.color);
        su27.engineLaunch();
        su27.planeRise();
        su27.up();
        su27.left();
        su27.down();
        su27.right();
        su27.stealthTechnology();
        System.out.print("Готую ядерний удар. ");
        su27.nuclearStrike();
        System.out.print("Вмикаю турбоприскорення. ");
        su27.turboAcceleration();
        su27.planeLanding();

    }
}
