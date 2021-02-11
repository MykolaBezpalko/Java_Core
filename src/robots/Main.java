package robots;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        CoffeeRobot coffeeRobot = new CoffeeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCooker robotCooker = new RobotCooker();

        Robot[] robots = {robot, coffeeRobot, robotDancer, robotCooker};

        for (int i = 0; i < robots.length; i++) {
            robots[i].work();
        }
    }
}
