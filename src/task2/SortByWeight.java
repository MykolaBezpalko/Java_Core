package task2;

import java.util.Comparator;

public class SortByWeight implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
            return o1.weight - o2.weight;
    }
}
