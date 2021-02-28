import java.util.*;

public class Fraction {
    String name;

    Fraction(String name) {
        this.name = name;
    }

    List<Deputat> deputates = new ArrayList<>();

    Deputat addDeputat(String name, int age, boolean briber) {
        return new Deputat(name, age, briber);
    }

    void deleteDeputat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введіть ім'я депутата щоб його видалити з фракції:");
        String deputateForDelete = sc.next();
        deputates.removeIf(deputate -> deputate.getName().equals(deputateForDelete));
    }

    public String getName() {
        return name;
    }

    void showBribers() {
        for (Deputat deputate : deputates) {
            if (deputate.isBriber())
                System.out.println(deputate.getName() + ": " + deputate.getBribe());
        }
    }

    void showBiggestBriber() {
        int maxBribe = 0;
        for (Deputat deputate : deputates) {
            if (deputate.getBribe() > maxBribe) maxBribe = deputate.getBribe();
        }
        for (Deputat deputate : deputates) {
            if (maxBribe == deputate.getBribe())
                System.out.println(deputate.getName() + ": " + maxBribe);
        }
    }

    void showAllDeputates() {
        for (Deputat deputate : deputates) {
            System.out.println(deputate.getName() + " ");
        }
    }

    void cleanupFraction() {
        deputates.clear();
    }
}
