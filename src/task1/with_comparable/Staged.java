package task1.with_comparable;

public class Staged implements Comparable<Staged> {

    private String name;
    private int stage;

    public Staged(String s, int stage) {
        setName(s);
        setStage(stage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    @Override
    public String toString() {
        return "Creating{" +
                "name='" + name + '\'' +
                ", stage=" + stage +
                '}';
    }

    @Override
    public int compareTo(Staged o) {
        if(( this.getStage() - o.getStage()) == 0){
            return o.getName().compareTo(this.getName());
        }else
            return this.getStage() - o.getStage();
    }
}
