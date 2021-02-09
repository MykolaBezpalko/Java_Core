public class HomeWorkLesson1 {
    public static void main(String[] args) {
        byte b = 0;
        char c = 'a';
        int integer = 100;
        double d = 50.0;
        float f = 60.0f;
        long l = 200L;
        boolean B = true;

        System.out.println("maxByte = " + Byte.MAX_VALUE);
        System.out.println("minByte = " + Byte.MIN_VALUE);
        System.out.println("maxChar = " + (int) Character.MAX_VALUE);
        System.out.println("minChar= " + (int) Character.MIN_VALUE);
        System.out.println("maxInteger = " + Integer.MAX_VALUE);
        System.out.println("maxInteger = " + Integer.MIN_VALUE);
        System.out.println("maxDouble = " + (double) Double.MAX_VALUE);
        System.out.println("minDouble = " + (double) Double.MIN_VALUE);
        System.out.println("maxFloat = " + Float.MAX_VALUE);
        System.out.println("minFloat = " + Float.MIN_VALUE);
        System.out.println("maxLong = " + Long.MAX_VALUE);
        System.out.println("minLong = " + Long.MIN_VALUE);
        System.out.println("maxBoolean = " + B);
        System.out.println("minBoolean = " + !B);
        System.out.println();
        System.out.println();


        int[] arr = {99, 3, 2, 8, 90, 7, 5, 18, 22, 13};

        System.out.println("Початковий масив: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

        System.out.println("Мінімальне значення: " + arr[0]);
        System.out.println("Мінімальне значення: " + arr[arr.length - 1]);

    }
}
