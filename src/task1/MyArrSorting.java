package task1;

import java.util.*;

public class MyArrSorting {
    public static void main(String[] args) {

        Integer[] myArray = new Integer[15];
        Random r = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = r.nextInt((100 - 1) + 1) + 1;
        }

        System.out.println("Перед сортуванням: \n" + Arrays.toString(myArray));

        Arrays.sort(myArray);
        System.out.println("Після сортуванням: \n" + Arrays.toString(myArray));

        Arrays.sort(myArray, Collections.reverseOrder());
        System.out.println("Після зворотнього сортуванням: \n" + Arrays.toString(myArray));
    }

}
