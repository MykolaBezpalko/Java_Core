package task2;

public class Commodity implements Comparable<Commodity> {
    String name;
    int length;
    int width;
    int weight;

    public Commodity(String name, int length, int width, int weight) {
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Товар{ " + name +
                ", довжина: " + length +
                ", ширина: " + width +
                ", вага: " + weight +
                '\'' +
                '}';
    }

    @Override
    public int compareTo(Commodity o) {
        if (this.name.compareTo(o.name) == 0) return this.length - o.length;
        if (this.length - o.length == 0) return this.width - o.width;
        if (this.width - o.width == 0) return this.weight = o.weight;

        return this.name.compareTo(o.name);
    }

}
