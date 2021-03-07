import java.util.Random;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   public  static Person personGenerator(){
        Random r = new Random();
        int val1 = r.nextInt(10);
        String n;
        switch (val1){
            case 0:{n = "Alina"; break;}
            case 1:{n = "Marlon"; break;}
            case 2:{n = "Ivan"; break;}
            case 3:{n = "Marina"; break;}
            case 4:{n = "Carlos"; break;}
            case 5:{n = "Amilia"; break;}
            case 6:{n = "Sasha"; break;}
            case 7:{n = "Carter"; break;}
            case 8:{n = "Veronica"; break;}
            case 9:{n = "Marsha"; break;}
            default:{n = "no Person Name";}
        }
        return new Person(n, r.nextInt(70)+1);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{"  + name + '\''  + age + " years" +
                '}';
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
}
