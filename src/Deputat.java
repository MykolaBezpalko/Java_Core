public class Deputat extends Human {
    private String name;
    private int age;
    private boolean briber;
    private int bribe;

    public Deputat(String name, int age, boolean briber) {
        this.name = name;
        this.age = age;
        this.briber = briber;
    }

    void giveBribe(int bribeAmount) {
        if (!briber) {
            System.out.println("Цей депутат не бере хабарів.");
        } else {
            System.out.println("Сума хабаря: " + bribeAmount + "грн.");
            if (bribe > 5000) System.out.println("Поліція ув'язнить депутата.");
            setBribe(bribeAmount);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBriber() {
        return briber;
    }

    public void setBriber(boolean briber) {
        this.briber = briber;
    }

    public int getBribe() {
        return bribe;
    }

    public void setBribe(int bribe) {
        this.bribe = bribe;
    }
}
