package task2;

import java.util.Comparator;

public class SortByWidth implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        if(o1.width - o2.width == 0){
            if(o1.name.equals(o2.name)) return o1.length - o2.length;
            return o1.name.compareTo(o2.name);
        }
        return o1.width - o2.width;

    }
}
