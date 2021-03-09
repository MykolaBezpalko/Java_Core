import java.sql.SQLOutput;

public class Testing {

    public int value;
    private int pValue;

    public String s;
    private String ps;

   protected boolean flag = false;

     Testing(String s, int v){
        this.s = s;
        value = v;
    }

     Testing( int v, String ps, boolean b){
        this.ps = ps;
        this.pValue = v;
        flag = b;
    }

    public void myMethod(){
        System.out.println(s);
    }

    void mySecondMethod(String ps){
         this.ps = ps;
        System.out.println(this.ps);
    }

    @Override
    public String toString() {
        return "Testing{" +
                "value: " + value +
                ", pValue: " + pValue +
                ", s: '" + s + '\'' +
                ", ps: '" + ps + '\'' +
                ", flag: " + flag +
                '}';
    }
}
