package task1.with_comparable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Staged> set = new HashSet<Staged>();
        set.add(new Staged("Andrew", 1));
        set.add(new Staged("David", 4));
        set.add(new Staged("Bobby", 1));
        set.add(new Staged("Bobby", 2));
        set.add(new Staged("Freddy", 5));
        set.add(new Staged("Candy", 3));
        set.add(new Staged("Andrew", 1));

        System.out.println("Не відсортований список: " + set.size() + " елементів");
        for (Staged c : set) {
            System.out.println(c);
        }
        System.out.println();
        Set<Staged> sorted = new TreeSet<Staged>(set);
        System.out.println("Відсортовано: " + sorted.size() + " елементів");
        for (Staged c : sorted) {
            System.out.println(c);
        }

    }
}
