import java.util.*;

public class ZooClub {
   static  Map<Person, List<Pet>> map = new HashMap<>();
    static List<Pet> petsListGenerator() {
        Random rand = new Random();
        int size = rand.nextInt(4) + 1;
        Pet[] p = new Pet[size];
        for (int i = 0; i < size; i++)
            p[i] = Pet.petGenerator();

        return new ArrayList<Pet>(Arrays.asList(p));
    }

}
