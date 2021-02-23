package task3and4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words {
    public static void main(String[] args) {
        int wordsCount = 0;
        int maxRepeats = 0;
        int wordIndex = 0;

        System.out.println("Введіть речення щоб підрахувати кількість слів у ньому.");
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();

        ArrayList<String> splitter =
                new ArrayList<>(Arrays.asList(test.split(" ")));

        for (int i = 0; i < splitter.size(); i++) {
            if (splitter.get(i).length() < 2) splitter.remove(i);
        }

        for (int i = 0; i < splitter.size(); i++) {
            if (splitter.get(i).length() > 1) {
                wordsCount++;
            }
        }

        System.out.println("Всього введено слів: " + wordsCount);

        int[] reapeatedWords = new int[splitter.size()];

        for (int i = 0; i < splitter.size(); i++) {
            for (int j = i + 1; j < splitter.size(); j++) {
                if (splitter.get(j).equals(splitter.get(i))) reapeatedWords[i]++;
            }
        }
        for (int i = 0; i < reapeatedWords.length; i++) {
            if (reapeatedWords[i] > maxRepeats) {
                maxRepeats = reapeatedWords[i];
                wordIndex = i;
            }
        }
        System.out.println("Найчастіше було введено слово: "
                + splitter.get(wordIndex) + " - "
                + (maxRepeats + 1));
        sc.close();
    }
}
