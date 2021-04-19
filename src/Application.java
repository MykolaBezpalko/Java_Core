import java.util.Random;

public class Application {
    static final Number[] array = createRandomArray();

    public static void main(String[] args) {
        Collections collection = new Collections(array);
        Iterator normalIterator = collection.startToEnd();

        System.out.println("Normal iteration: ");
        while (normalIterator.hasNext()) {
            System.out.print(normalIterator.next() + " ");
        }
        System.out.println();

        System.out.println("Back iteration: ");
        Iterator backIterator = collection.endToStart();
        while (backIterator.hasNext()) {
            System.out.print(backIterator.next() + " ");
        }
        System.out.println();

        System.out.println("Use anonymous class: ");
        collection.useAnonymous();
        System.out.println();

        System.out.println("Use Local class");
        collection.minus100();

        System.out.println("Use static class iteration: ");
        Collections.JustUnpaired unpaired = new Collections.JustUnpaired(array);
        Iterator iterator = collection.startToEnd();
        unpaired.printUnpairArray(iterator);
        System.out.println();

    }

    static Number[] createRandomArray() {
        Number[] array = new Number[20];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(201);
        }
        return array;
    }


}
