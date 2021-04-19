import java.util.NoSuchElementException;

public class Collections {
    private Number[] numbers;

    public Collections(Number[] numbers) {
        this.numbers = numbers;
    }

    class StartToEnd implements Iterator {
        int count = 0;

        @Override
        public boolean hasNext() {
            return count < numbers.length;
        }

        @Override
        public Object next() {
            if (!hasNext()) throw new NoSuchElementException();
            return numbers[count++];

        }
    }

    public StartToEnd startToEnd() {
        return new StartToEnd();
    }

    class EndToStart implements Iterator {
        int count = numbers.length - 1;

        @Override
        public boolean hasNext() {
            return count >= 0;
        }

        @Override
        public Object next() {
            if (!hasNext()) throw new NoSuchElementException();
            return numbers[count--];
        }
    }

    public EndToStart endToStart() {
        return new EndToStart();
    }

    void useAnonymous() {
        Iterator anonIterator = new Iterator() {
            int counter = numbers.length - 1;

            @Override
            public boolean hasNext() {
                return counter >= 0;
            }

            @Override
            public Object next() {
                return numbers[counter--];
            }
        };

        int position = 1;
        while (anonIterator.hasNext()) {
            Integer current = (Integer) anonIterator.next();
            if (position == 3 && current % 2 != 0) {
                System.out.print(current + " ");
                position = 1;
                continue;
            }
            position++;
        }
    }

    void minus100() {
        class Minus100 implements Iterator {
            int counter;

            @Override
            public boolean hasNext() {
                return counter < numbers.length;
            }

            @Override
            public Object next() {
                if (!hasNext()) throw new NoSuchElementException();
                return Application.array[counter++];
            }
        }

        Iterator iter = new Minus100();
        int position = 1;
        while (iter.hasNext()) {
            Integer current = (Integer) iter.next();
            if (position == 5 && current % 2 == 0) {
                current -= 100;
                System.out.println(current + " ");
                position = 1;
                continue;
            }
            position++;
        }
    }

    static class JustUnpaired {
        Number[] array;

        JustUnpaired(Number[] list) {
            array = list;
        }

        public void printUnpairArray(Iterator iter) {
            while (iter.hasNext()) {
                Integer n = (Integer) iter.next();
                if (n % 2 == 0) n++;
                System.out.print(n + " ");
            }

        }
    }

}
