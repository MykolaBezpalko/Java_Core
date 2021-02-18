/*
* Клас з якого починається точка входу програми,
* містить в собі основну логіку програми, меню і навігацію по ньому.
* Реалізує маніпуляції над інформацією про місяці і пори року.
* */

package task1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try {
            mainLogic();
        } catch (Exception e) {
            System.err.println("Помилка. Вибір пунктів меню здійснюється тільки цифрами. " +
                    "Спробуйте ще раз.\n" + e);
            try {
                mainLogic();
            } catch (Exception exception) {
                System.err.println("Помилка. Вибір пунктів меню здійснюється тільки цифрами. " +
                        "\n" + exception + "\n\n\tВихід з програми.");
            }

        }
    }

    /** Метод який відображає головну логіку програми: навігацію, витяг інформації, відображення
     * помилок при введенні, їх обробка. Завершеється при введенні значення 0 (нуль) */
    static void mainLogic() {
        Scanner scanner = new Scanner(System.in);
        Months[] months = Months.values();
        while (true) {
            query();
            int menuItem = scanner.nextInt();
            if ((menuItem == 1)
                    || (menuItem == 2)
                    || (menuItem == 3)
                    || (menuItem == 4)
                    || (menuItem == 5)
                    || (menuItem == 6)
                    || (menuItem == 7)
                    || (menuItem == 8)
                    || (menuItem == 9)
                    || (menuItem == 10)
                    || (menuItem == 0)) {
                switch (menuItem) {
                    case 1: {
                        System.out.println("Введіть назву місяця англійською мовою: ");
                        scanner = new Scanner(System.in);
                        String s = scanner.next().toUpperCase();
                        boolean flag = isExists(months, s);
                        if (!flag) {
                            try {
                                throw new MyInputException("Місяць не знайдено.");
                            } catch (MyInputException e) {
                                System.err.println(" Спробуйте ще раз.");
                            }
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("Введіть пору року: ");
                        scanner = new Scanner(System.in);
                        String season = scanner.next().toUpperCase();
                        boolean flag = false;
                        for (Months m : months) {
                            if (m.getSeason().name().equals(season)) {
                                flag = true;
                            }
                        }
                        if (flag) {
                            for (Months m : months) {
                                if (m.getSeason().toString().equals(season)) {
                                    System.out.println(m);
                                }
                            }
                        }
                        if (!flag) {
                            try {
                                throw new MyInputException("Пору року не знайдено.");
                            } catch (MyInputException e) {
                                System.err.println(" Спробуйте ще раз.");
                            }
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Введіть кількість днів місяця.");
                        scanner = new Scanner(System.in);
                        int days = scanner.nextInt();
                        boolean flag = daysOfMonth(months, days);
                        if (!flag) {
                            try {
                                throw new MyInputException("Місяць з заданою кількістю днів не знайдено");
                            } catch (MyInputException e) {
                                System.err.println(" Спробуйте ще раз.");
                            }
                        }
                        break;
                    }
                    case 4: {
                        longestMonths();
                        break;
                    }
                    case 5: {
                        shortestMonths();
                        break;
                    }
                    case 6: {
                        System.out.println("Введіть пору року англійською мовою.(WINTER,SPRING,SUMMER, AUTUMN)");
                        scanner = new Scanner(System.in);
                        Seasons[] seasons = Seasons.values();
                        String season = scanner.next().toUpperCase();
                        boolean flag = isExistsSeason(seasons, season);
                        if (flag) {
                            Seasons s = Seasons.valueOf(season);
                            int ord = s.ordinal();
                            if (ord == seasons.length - 1) {
                                ord = 0;
                                System.out.println(seasons[ord]);
                            } else {
                                System.out.println(seasons[ord + 1]);
                            }
                        }
                        if (!flag) {
                            System.out.println();
                            try {
                                throw new MyInputException("Назву сезону не знайдено.");
                            } catch (MyInputException e) {
                                System.err.println(" Спробуйте ще раз.");
                            }
                        }
                        break;
                    }
                    case 7: {
                        System.out.println("Введіть пору року англійською мовою.(WINTER,SPRING,SUMMER, AUTUMN)");
                        scanner = new Scanner(System.in);
                        Seasons[] seasons = Seasons.values();
                        String season = scanner.next().toUpperCase();
                        boolean flag = isExistsSeason(seasons, season);
                        if (flag) {
                            Seasons s = Seasons.valueOf(season);
                            int ord = s.ordinal();
                            if (ord == 0) {
                                ord = seasons.length - 1;
                                System.out.println(seasons[ord]);
                            } else {
                                System.out.println(seasons[ord - 1]);
                            }
                        }
                        if (!flag) {
                            System.out.println();
                            try {
                                throw new MyInputException("Назву сезону не знайдено.");
                            } catch (MyInputException e) {
                                System.err.println(" Спробуйте ще раз.");
                            }
                        }
                        break;
                    }
                    case 8: {
                        for (Months m : Months.values()) {
                            if (m.getDays() % 2 == 0) {
                                System.out.println(m.name());
                            }
                        }
                        break;
                    }
                    case 9: {
                        for (Months m : Months.values()) {
                            if (m.getDays() % 2 == 1) {
                                System.out.println(m.name());
                            }
                        }
                        break;
                    }
                    case 10: {
                        System.out.println("Введіть назву місяця англійською мовою: ");
                        scanner = new Scanner(System.in);
                        String s = scanner.next().toUpperCase();
                        boolean flag = isExists(months, s);
                        if (!flag) {
                            try {
                                throw new MyInputException("Місяць не знайдено");
                            } catch (MyInputException e) {
                                System.err.println(" Спробуйте ще раз.");
                            }
                        }
                        if (flag) {
                            for (Months m : months) {
                                if (m.name().equals(s)) {
                                    int days = m.getDays();
                                    if (days % 2 == 0) {
                                        System.out.println("Має парне число днів.");
                                    } else {
                                        System.out.println("Має  НЕпарне число днів.");
                                    }
                                }
                            }
                        }
                        mainLogic();
                    }
                    case 0:
                        return;
                }
            } else {
                try {
                    throw new MyInputException("Виберіть значення від 1 до 10. Нуль для виходу. ");
                } catch (Exception e) {
                    System.err.println("Повторіть ввід.");
                }
            }
        }
    }

    /** Метож має в собі інформацію про запити і навігацію по них.*/
    static void query() {
        System.out.println("0 (zero) для виходу");
        System.out.println("Натисніть 1 щоб перевірити чи місяць існує.");
        System.out.println("Натисніть 2 щоб вивести всі місяці, відносні до пори року.");
        System.out.println("Натисніть 3 щоб вивести місяці з заданою кількістю днів");
        System.out.println("Натисніть 4 щоб показати місяці з більшою кількістю днів.");
        System.out.println("Натисніть 5 щоб показати місяці з меншою кількістю днів.");
        System.out.println("Натисніть 6 щоб вивести на екран наступну пору року після заданої.");
        System.out.println("Натисніть 7 щоб вивести попередню пору року від заданої.");
        System.out.println("Натисніть 8 щоб вивести всі місяці з парною кількістю днів.");
        System.out.println("Натисніть 9 щоб вивести місяці з непарною кількістю днів.");
        System.out.println("Натисніть 10 щоб дізнатись чи вказаний місяць має парну кількість днів.");
        System.out.println();
    }

    /** Метод перевіряє чи є в списку задана назва місяця
     * true - якщо є */
    static boolean isExists(Months[] months, String month) {
        boolean flag = false;
        for (Months m : months) {
            if (m.name().equals(month)) {
                System.out.println("Місяць існує.");
                flag = true;
            }
        }
        return flag;
    }

    /** Метод перевіряє чи є в списку задана назва пори року
     * true - якщо є */
    static boolean isExistsSeason(Seasons[] seasons, String season) {
        boolean flag = false;
        for (Seasons s : seasons) {
            if (s.name().equals(season)) {
                flag = true;
            }
        }
        return flag;
    }

    /** Метод порівнює введену кількість днів із кількістю днів у місяцях зі списку
     * false - якщо збігів зі списком немає.*/
    static boolean daysOfMonth(Months[] months, int days) {
        boolean flag = false;
        for (Months m : months) {
            if (m.getDays() == days) {
                System.out.println(m.name());
                flag = true;
            }
        }
        return flag;
    }

    /** Метод дозволяє відобразити в консолі місяці з більшою кількістю днів */
    static void longestMonths() {
        for (Months m : Months.values()) {
            if (m.getDays() > 30) System.out.println(m.name());
        }
    }

    /** Метод дозволяє відобразити в консолі місяці з меншою кількістю днів */
    static void shortestMonths() {
        for (Months m : Months.values()) {
            if (m.getDays() < 31) System.out.println(m.name());
        }
    }
}
