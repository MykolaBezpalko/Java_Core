package task2;

import java.util.*;

public class Main {
    static boolean flag = true;
    static Set<Commodity> items = new HashSet<>();

    public static void main(String[] args) {
        items.add(new Commodity("диван", 235, 90, 60));
        items.add(new Commodity("стіл", 200, 80, 30));
        items.add(new Commodity("стіл", 150, 80, 25));
        items.add(new Commodity("стілець", 50, 50, 15));
        items.add(new Commodity("стілець", 45, 55, 33));
        menuLogic();
    }

    static void menu() {
        System.out.println("""
                 '1' для додання товару в список.
                 '2' для видалення товару.
                 '3' для заміни товару.
                 '4' для сортування товару за назвою.
                 '5' для сортування товару за довжиною.
                 '6' для сортування товару за шириною.
                 '7' для сортування товару за вагою.
                 '8' щоб вивести характеристики вказаного товару.
                 'Q' для додання товару в список.
                 'menu' або 'меню' для додання товару в список.
                """);
    }

    static void menuLogic() {
        menu();
        while (flag) {
            Scanner sc = new Scanner(System.in);
            String result = sc.next();
            if (result.equals("q")) System.exit(0);
            if (result.equals("menu") || result.equals("меню")) menu();
            try {
                switch (result) {
                    case "1": {
                        System.out.println("Назва:");
                        String name = sc.next();
                        System.out.println("Довжина:");
                        int length = sc.nextInt();
                        System.out.println("Ширина:");
                        int width = sc.nextInt();
                        System.out.println("Вага: ");
                        int weight = sc.nextInt();
                        addItem(name, length, width, weight);
                        System.out.println("Товар додано.");
                        break;
                    }
                    case "2": {
                        System.out.println("Введіть назву товару і його довжину щоб видалити.");
                        Scanner s = new Scanner(System.in);
                        String name = s.nextLine();
                        try {
                            int count = 1;
                            for (Commodity c : items) {
                                if (name.equals(c.name)) count++;
                            }
                            if (count <= 1) throw new Exception();
                        } catch (Exception e) {
                            System.err.println("Вказаний товар не існує");
                            System.out.println("Виберіть пункт меню.");
                            break;
                        }
                        int count = 0;
                        for (Commodity c : items) {
                            if (c.name.equals(name)) count++;
                        }
                        if (count == 1) {
                            items.removeIf(c -> c.name.equals(name));
                            System.out.println("Успішно видалено. ");
                        } else {
                            System.out.println("Таких об'єктів більше одного, введіть його довжину. ");
                            int length = s.nextInt();
                            try {
                                int count2 = 1;
                                for (Commodity c : items) {
                                    if (length == c.length) count2++;
                                }
                                if (count2 <= 1) throw new Exception();
                            } catch (Exception e) {
                                System.err.println("Вказану довжину не знайдено.");
                                System.out.println("Виберіть пункт меню.");
                                break;
                            }
                            items.removeIf(c -> c.name.equals(name) && c.length == length);
                            System.out.println("Успішно видалено. ");
                        }
                        break;
                    }
                    case "3": {
                        Set<Commodity> forShift = new LinkedHashSet<>(items);
                        for (Commodity c : forShift) {
                            System.out.println(c);
                        }
                        Scanner s = new Scanner(System.in);
                        System.out.println();
                        System.out.println("Виберіть товар з вищевказаних, який хочете замінити.");
                        String name = s.nextLine();
                        int count = 0;
                        for (Commodity c : items) {
                            if (c.name.equals(name)) count++;
                        }
                        if (count == 1) {
                            items.removeIf(c -> c.name.equals(name));
                            System.out.println("Тепер вводьте новий товар щоб замінити вибраний.");
                            System.out.println("Назва:");
                            String replace = sc.next();
                            System.out.println("Довжина:");
                            int length = sc.nextInt();
                            System.out.println("Ширина:");
                            int width = sc.nextInt();
                            System.out.println("Вага: ");
                            int weight = sc.nextInt();
                            addItem(replace, length, width, weight);
                            System.out.println("Товар додано.");
                        } else {
                            System.out.println("Таких об'єктів більше одного, введіть його довжину. ");
                            int length = s.nextInt();
                            items.removeIf(c -> c.name.equals(name) && c.length == length);
                            items.removeIf(c -> c.name.equals(name));
                            System.out.println("Тепер вводьте новий товар щоб замінити вибраний.");
                            System.out.println("Назва:");
                            String replace = sc.next();
                            System.out.println("Довжина:");
                            int l = sc.nextInt();
                            System.out.println("Ширина:");
                            int width = sc.nextInt();
                            System.out.println("Вага: ");
                            int weight = sc.nextInt();
                            addItem(replace, l, width, weight);
                            System.out.println("Товар додано.");
                        }
                        break;
                    }
                    case "4": {
                        System.out.println("За алфавітом: ");
                        for (Commodity c : items) {
                            System.out.println(c);
                        }
                        break;
                    }
                    case "5": {
                        System.out.println("Відсортовано за довжиною.");
                        Set<Commodity> forSorting = new TreeSet<>(new SortByLength());
                        forSorting.addAll(items);
                        for (Commodity c : forSorting) {
                            System.out.println(c);
                        }
                        break;

                    }
                    case "6": {
                        System.out.println("Відсортовано за шириною.");
                        Set<Commodity> forSorting = new TreeSet<>(new SortByWidth());

                        forSorting.addAll(items);
                        for (Commodity c : forSorting) {
                            System.out.println(c);
                        }
                        break;
                    }
                    case "7": {
                        System.out.println("Відсортовано за вагою.");
                        Set<Commodity> sortWeight = new TreeSet<>(new SortByWeight());

                        sortWeight.addAll(items);
                        for (Commodity c : sortWeight) {
                            System.out.println(c);
                        }
                        break;
                    }
                    case "8": {
                        System.out.println("Список всіх елементів.");
                        List<Commodity> elements = new ArrayList<>(items);
                        Scanner s = new Scanner(System.in);
                        for (int j = 0; j < elements.size(); j++) {
                            System.out.println(j + 1 + ": " + elements.get(j));
                        }
                        try {
                            System.out.println();
                            System.out.println("Вкажіть порядковий номер елемента щоб його вибрати.");
                            int i = s.nextInt();
                            if (i >= elements.size()) throw new Exception();
                            System.out.println(elements.get(i - 1));
                        } catch (Exception e) {
                            System.err.println("Вводьте тільки цифрами.");
                        }
                    }
                    default: {
                        System.out.println();
                        System.out.println("Виберіть пункт меню.");
                    }
                }
            } catch (Exception e) {
                System.err.println("Помилка вводу.");
            }
        }
    }

    static void addItem(String name, int length, int width, int weight) {
        items.add(new Commodity(name, length, width, weight));
    }
}
