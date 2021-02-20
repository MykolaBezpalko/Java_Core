package task3and4;

import java.util.Arrays;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {

        System.out.println("Введіть речення щоб підрахувати кількість слів у ньому.");
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine().toLowerCase();
        String[] splitedTest = test.split(" ");

        int wordsCount = 0;
        for (int i = 0; i < splitedTest.length; i++) {
            if (splitedTest[i].length() > 1)
                wordsCount++;
        }
        System.out.println("Всього введено слів: " + wordsCount);

        int[] reapeatedWords = new int[splitedTest.length];

        for(int i=0; i<splitedTest.length; i++){
            for(int j = i+1; j<splitedTest.length; j++){
                if(splitedTest[i].equals(splitedTest[j])) {
                     reapeatedWords[i]++;
                }
            }
        }
        int maxRepeats = 0;
        int wordIndex = 0;
        for(int i = 0; i<reapeatedWords.length; i++){
            if(reapeatedWords[i]> maxRepeats) {
                maxRepeats = reapeatedWords[i];
                wordIndex = i;
            }
        }

        System.out.println("Найчастіше було введено слово: "
                         + splitedTest[wordIndex].toUpperCase() + " - "
                         + (maxRepeats+1));

        sc.close();
    }
}
