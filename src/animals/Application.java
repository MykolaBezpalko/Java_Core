package animals;


public class Application {
    public static void information(Animal animal) {
        System.out.println("Animal { " +
                "Назва тварини = '" + animal.getName() + '\'' +
                ", Швидкість тварини = " + animal.getSpeed() + " км/год." +
                ", Вік тварини = " + animal.getAge() + " років " +
                '}');
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Вовк", 20, 3);
        information(animal);
        animal.setName("Птах");
        animal.setSpeed(80);
        animal.setAge(7);
        information(animal);
    }
}
