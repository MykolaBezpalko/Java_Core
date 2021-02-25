package task3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySelfBuilder {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Begin to input elements for adding them into ArrayList\n"
                +"Input 999 for remove element\n"+
                "Q for EXIT");
       try {
           while(flag){
               System.out.println();
               Object o = scanner.next();
               myList.add(o);

               if(o.equals("q")){
                   myList.remove(myList.size()-1);
                   flag = false;
               }

               if(o.equals("999")){
                   myList.remove(myList.size()-1);
                   System.out.println("input number of element for DELETE it (0 -> " + (myList.size()-1)+")");
                   myList.remove(scanner.nextInt());
                   System.out.println("Element deleted from array");
               }

               System.out.println(myList);
           }
       }catch(Exception e){
           System.err.println("Unexpected error, please start program again.");
       }


    }
}
