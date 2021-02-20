package task2;

import java.util.Scanner;

public class ChangeOnSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть речення українською.");
        String input = scanner.nextLine();
        StringBuffer test = new StringBuffer(input);

        char ch[] = new char[input.length()];
        test.getChars(0, input.length(), ch, 0);
        for (char c : ch) {
            if (c == 'а' | c == 'е' | c == 'и'
                | c == 'і' | c == 'о' | c == 'у'
                | c == 'я' | c == 'ю' | c == 'є'
                | c == 'ї')
            c = '-';
            System.out.print(c);
        }
    }
}
