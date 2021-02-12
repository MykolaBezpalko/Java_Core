package task2;

public class Test {
    private int count;
    private String s;
    private String str;

    Test(String str) {
        this(1, "First Test");
        this.str = str;
    }

    Test(int count, String s) {
        this.count = count;
        this.s = s;
    }


    public static void main(String[] args) {

        Test test1 = new Test(" Third parameter of first test");
        Test test2 = new Test(33, "Second Test");

        System.out.println(test1.count + " " + test1.s + test1.str);
        System.out.println(test2.count + " " + test2.s);
    }

}
