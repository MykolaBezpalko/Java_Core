import java.util.Random;

public class Pet {
    private String type;
    private String name;

    public Pet(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public static Pet petGenerator() {
        Random r = new Random();
        int val = r.nextInt(4) + 1;
        String t;
        switch (val) {
            case 1: { t = "cat"; break;}
            case 2: { t = "dog";break; }
            case 3: { t = "parrot";break;}
            case 4: { t = "hamster";break; }
            default: { t = "no type " + val; }
        }
        int val2 = r.nextInt(10);
        String n;
        switch (val2){
            case 0: {n = "Dodo"; break;}
            case 1:{n = "Bars"; break;}
            case 2:{n = "Spike"; break;}
            case 3:{n = "Walter"; break;}
            case 4:{n = "Cody"; break;}
            case 5:{n = "Chico"; break;}
            case 6:{n = "Marley"; break;}
            case 7:{n = "Coco"; break;}
            case 8:{n = "Marko"; break;}
            case 9:{n = "Mini"; break;}
            default: {n = "no Pet name"; break;}
        }

        return new Pet(t, n);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pet{ " + type + ": "+ '\'' + name + '\'' + '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
