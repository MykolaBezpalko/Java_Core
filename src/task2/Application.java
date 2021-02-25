package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Months> months = new ArrayList<Months>(Arrays.asList(Months.values()));
        ArrayList<Seasons> seasons = new ArrayList<Seasons>(Arrays.asList(Seasons.values()));
        System.out.println(months);


        while (true) {
            query();
            switch (scanner.next()) {
                case "1": {
                    System.out.println("Введіть назву місяця англійською мовою: ");
                    scanner = new Scanner(System.in);
                    String s = scanner.next().toUpperCase();
                    boolean flag = isExists(months, s);
                    if (!flag) {
                        System.out.println("Місяць не знайдено.");
                    }
                    break;
                }
                case "2": {
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
                        System.out.println("Такої пори року не існує.");
                    }
                    break;
                }
                case "3": {
                    System.out.println("Введіть кількість днів місяця.");
                    scanner = new Scanner(System.in);
                    int days = scanner.nextInt();
                    boolean flag = daysOfMonth(months, days);
                    if (!flag) {
                        System.out.println("Місяць з заданою кількістю днів не знайдено");
                    }
                    break;
                }
                case "4": {
                    longestMonths();
                    break;
                }
                case "5": {
                    shortestMonths();
                    break;
                }
                case "6": {
                    System.out.println("Введіть пору року англійською мовою.(WINTER,SPRING,SUMMER, AUTUMN)");
                    scanner = new Scanner(System.in);

                    String season = scanner.next().toUpperCase();
                    boolean flag = isExistsSeason(seasons, season);
                    if (flag) {
                        Seasons s = Seasons.valueOf(season);
                        int ord = s.ordinal();
                        if (ord == seasons.size() - 1) {
                            ord = 0;
                            System.out.println(seasons.get(ord));
                        } else {
                            System.out.println(seasons.get(ord+1));
                        }
                    }
                    if (!flag) {
                        System.out.println("Назву сезону не знайдено.");
                    }
                    break;
                }
                case "7": {
                    System.out.println("Введіть пору року англійською мовою.(WINTER,SPRING,SUMMER, AUTUMN)");
                    scanner = new Scanner(System.in);
                    String season = scanner.next().toUpperCase();
                    boolean flag = isExistsSeason(seasons, season);
                    if (flag) {
                        Seasons s = Seasons.valueOf(season);
                        int ord = s.ordinal();
                        if (ord == 0) {
                            ord = seasons.size() - 1;
                            System.out.println(seasons.get(ord));
                        } else {
                            System.out.println(seasons.get(ord - 1));
                        }
                    }
                    if (!flag) {
                        System.out.println("Назву сезону не знайдено.");
                    }
                    break;
                }
                case "8": {
                    for (Months m : Months.values()) {
                        if (m.getDays() % 2 == 0) {
                            System.out.println(m.name());
                        }
                    }
                    break;
                }
                case "9": {
                    for (Months m : Months.values()) {
                        if (m.getDays() % 2 == 1) {
                            System.out.println(m.name());
                        }
                    }
                    break;
                }
                case "10": {
                    System.out.println("Введіть назву місяця англійською мовою: ");
                    scanner = new Scanner(System.in);
                    String s = scanner.next().toUpperCase();
                    boolean flag = isExists(months, s);
                    if (!flag) {
                        System.out.println("Місяць не знайдено.");
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
                }
                case "q":
                    return;
            }
        }
    }

    static void query() {
        System.out.println("Q для виходу");
        System.out.println("1 щоб перевірити чи місяць існує.");
        System.out.println("2 щоб вивести всі місяці, відносні до пори року.");
        System.out.println("3 щоб вивести місяці з заданою кількістю днів");
        System.out.println("4 щоб показати місяці з більшою кількістю днів.");
        System.out.println("5 щоб показати місяці з меншою кількістю днів.");
        System.out.println("6 щоб вивести на екран наступну пору року після заданої.");
        System.out.println("7 щоб вивести попередню пору року від заданої.");
        System.out.println("8 щоб вивести всі місяці з парною кількістю днів.");
        System.out.println("9 щоб вивести місяці з непарною кількістю днів.");
        System.out.println("10 щоб дізнатись чи вказаний місяць має парну кількість днів.");
        System.out.println();
    }

    static boolean isExists(ArrayList<Months> months, String month) {
        boolean flag = false;
        for (Months m : months) {
            if (m.name().equals(month)) {
                System.out.println("Місяць існує.");
                flag = true;
            }
        }
        return flag;
    }

    static boolean isExistsSeason(ArrayList<Seasons> seasons, String season) {
        boolean flag = false;
        for (Seasons s : seasons) {
            if (s.name().equals(season)) {
                flag = true;
            }
        }
        return flag;
    }

    static boolean daysOfMonth(ArrayList<Months> months, int days) {
        boolean flag = false;
        for (Months m : months) {
            if (m.getDays() == days) {
                System.out.println(m.name());
                flag = true;
            }
        }
        return flag;
    }

    static void longestMonths() {
        for (Months m : Months.values()) {
            if (m.getDays() > 30) System.out.println(m.name());
        }
    }

    static void shortestMonths() {
        for (Months m : Months.values()) {
            if (m.getDays() < 31) System.out.println(m.name());
        }

    }
}
