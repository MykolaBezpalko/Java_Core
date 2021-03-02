package task1.with_comporator;

public class Creating {

    private String name;
    private int stage;

    public Creating(String s, int stage) {
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
}
