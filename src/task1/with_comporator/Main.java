package task1.with_comporator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Creating> set = new HashSet<Creating>();
        set.add(new Creating("a", 1));
        set.add(new Creating("a", 1));
        set.add(new Creating("d", 4));
        set.add(new Creating("b", 1));
        set.add(new Creating("b", 2));
        set.add(new Creating("f", 5));
        set.add(new Creating("c", 3));

        System.out.println("Не відсортований список: " + set.size() + " елементів");
        for (Creating c : set) {
            System.out.println(c);
        }
        System.out.println();

        Set<Creating> sorted = new TreeSet<Creating>(new ComparatorCreating());
        sorted.addAll(set);
        System.out.println("Відсортований список: " + sorted.size() + " елементів");
        for (Creating c : sorted) {
            System.out.println(c);
        }
    }
}
