import java.util.*;

public class VerhovnaRada {
    private static VerhovnaRada rada;

    private VerhovnaRada() {
    }

    static VerhovnaRada getRada() {
        if (rada == null) rada = new VerhovnaRada();
        return rada;
    }

    List<Fraction> fractions = new ArrayList<>();

    Fraction getFraction(String enterName) {
        for (Fraction fr : fractions) {
            if (fr.getName().equals(enterName)) return fr;
        }
        return null;
    }

    void addFraction(String name) {
        fractions.add(new Fraction(name));
    }

    void deleteFraction() {
        Scanner sc = new Scanner(System.in);

        String nameForDelete = sc.next();
        fractions.removeIf(fr -> fr.getName().equals(nameForDelete));
    }

    void showAllFracrions() {
        for (Fraction fr : fractions) {
            System.out.print(fr.getName() + ", ");
        }
    }

    void addDeputateToFraction(Fraction fr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введтіть ім'я депутата.");
        String name = sc.nextLine();

        System.out.println("Тепер введтіть вік депутата.(тільки цифрами) ");
        int age = sc.nextInt();

        System.out.println("Чи цей депутат буде хабарником. (1 - так | 0 - ні) ");
        int br = sc.nextInt();
        boolean briber;
        if (br == 1) briber = true;
        else briber = false;
        Deputat d = fr.addDeputat(name, age, briber);
        if (briber) {
            System.out.println("Тоді введіть суму хабаря.");
            d.giveBribe(sc.nextInt());
        }
        fr.deputates.add(d);
    }

    void deleteDeputateFromFraction(Fraction fr) {
        fr.deleteDeputat();
    }

    void biggestFractionBriber(Fraction fr) {
        fr.showBiggestBriber();
    }

    void showAllFractionDeputates(Fraction fr) {
        fr.showAllDeputates();
    }
}
