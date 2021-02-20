package task1;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть слово щоб перевірити чи воно поліндром.");
            String test = sc.next().toLowerCase();
            String reverseTest;

            char testArray[] = test.toCharArray();
            char reverseArray[] = new char[testArray.length];

            if (testArray.length > 5 | testArray.length < 5) throw new MyError();

            int j = testArray.length - 1;

            for (int i = 0; i < testArray.length; i++) {
                reverseArray[i] = testArray[j];
                j--;
            }

            reverseTest = new String(reverseArray);

            if (test.equals(reverseTest)) {
                System.out.println("Слово є поліндромом.");
            } else {
                System.out.println("Слово не поліндром.");
            }

        } catch (MyError e) {
            System.err.println("Слово має складатись з 5 символів.");
        }
    }
}
