import java.util.Scanner;

public class Main {
    static boolean flag = true;

    public static void main(String[] args) {
        while (flag) {
            try {
                menuLogic();
            } catch (Exception e) {
                System.err.println("Помилка при введенні. Спробуйте ще раз.");
            }
        }
    }

    static void menu() {
        System.out.println
                ("""    
                        Введіть `99` для виходу
                        'menu' чи 'меню'- для перегляду меню.
                        Введіть 1 щоб додати фракцію
                        Введіть 2 щоб видалити конкретну фракцію
                        Введіть 3 щоб вивести усі  фракції
                        Введіть 4 щоб очистити конкретну фракцію
                        Введіть 5 щоб вивести конкретну фракцію
                        Введіть 6 щоб додати депутата в фракцію
                        Введіть 7 щоб видалити депутата з фракції
                        Введіть 8 щоб вивести список хабарників
                        Введіть 9 щоб вивести найбільшого хабарника""");
    }

    static void menuLogic() {
        Scanner sc = new Scanner(System.in);
        menu();
        while (flag) {
            String result = sc.nextLine();
            if (result.equals("99")) flag = false;
            if (result.equals("menu") || result.equals("меню")) menu();
            switch (result) {
                case "1": {
                    System.out.println("Введіть ім'я для нової фракції.");
                    VerhovnaRada.getRada().addFraction(sc.next());
                    System.out.println("Фракцію додано.");
                    break;
                }
                case "2": {
                    System.out.println("Введіть назву фракції, яку хочете видалити.");
                    VerhovnaRada.getRada().deleteFraction();
                    System.out.println("Фракцію видалено.");
                    break;
                }
                case "3": {
                    System.out.println("Список всіх фракцій: ");
                    if (VerhovnaRada.getRada().fractions.size() == 0)
                        System.out.print("Фракцій не створено.");
                    VerhovnaRada.getRada().showAllFracrions();
                    break;
                }
                case "4": {
                    System.out.println("Введіть назву фракції, з якої хочете все видалити.");
                    String nameFraction = sc.nextLine();
                    VerhovnaRada.getRada().getFraction(nameFraction).cleanupFraction();
                    System.out.println("Фракцію очищено від імен.");
                    break;
                }
                case "5": {
                    System.out.println("Введіть назву фракції щоб показати її депутатів.");
                    String nameFraction = sc.nextLine();
                    if (VerhovnaRada.getRada().getFraction(nameFraction).deputates.size() == 0) {
                        System.out.println("Фракція пуста.");
                    } else {
                        System.out.println("Депутати фракції: ");
                        VerhovnaRada.getRada().showAllFractionDeputates(
                                VerhovnaRada.getRada().getFraction(nameFraction));
                    }
                    break;
                }
                case "6": {
                    System.out.println("Введіть фракцію в яку додати депутата:");
                    String nameFraction = sc.nextLine();
                    System.out.println();
                    VerhovnaRada.getRada().addDeputateToFraction(
                            VerhovnaRada.getRada().getFraction(nameFraction));

                    System.out.println("Депутата успішно додано.");
                    break;
                }
                case "7": {
                    System.out.println("Введіть фракцію з якої видалити депутата:");
                    String nameFraction = sc.nextLine();
                    VerhovnaRada.getRada().deleteDeputateFromFraction(
                            VerhovnaRada.getRada().getFraction(nameFraction));
                    System.out.println("Депутата видалено.");
                    break;
                }
                case "8": {
                    System.out.println("Список всіх хабарників:");
                    for (Fraction fr : VerhovnaRada.getRada().fractions) {
                        fr.showBribers();
                    }
                    break;
                }
                case "9": {
                    System.out.println("Введіть фракцію щоб взнати найбільшого хабарника фракції.");
                    String nameFraction = sc.next();
                    System.out.println("Найбільший хабарник:");
                    VerhovnaRada.getRada().biggestFractionBriber(
                            VerhovnaRada.getRada().getFraction(nameFraction)
                    );
                    break;
                }
            }
        }
    }
}


