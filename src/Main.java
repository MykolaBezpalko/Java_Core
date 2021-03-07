
import java.util.*;
import java.util.Map.Entry;

public class Main {
    static boolean flag = true;

    public static void main(String[] args) {
        ZooClub.map.put(Person.personGenerator(), ZooClub.petsListGenerator());
        ZooClub.map.put(Person.personGenerator(), ZooClub.petsListGenerator());
        ZooClub.map.put(Person.personGenerator(), ZooClub.petsListGenerator());
        menuLogic();

    }

    static void menu() {
        System.out.println("""
                1 - add new member
                2 - add new pet to member
                3 - delete members pet
                4 - delete member
                5 - delete animal from everywhere
                6 - show zoo-club
                q - for exit
                menu - for show menu again
                """);
    }

    static void menuLogic() {
        try {
            menu();
            while (flag) {
                Scanner sc = new Scanner(System.in);
                String result = sc.next();
                if (result.equals("q")) {
                    flag = false;
                    System.exit(1);
                }
                switch (result) {
                    case "1": {
                        System.out.println("Give a name for new person.");
                        String s = sc.next();
                        System.out.println("How old is new person?");
                        int age = sc.nextInt();
                        ZooClub.map.put(new Person(s, age), new ArrayList<>());
                        System.out.println("Person added to zoo-club.");
                        break;
                    }
                    case "2": {
                        System.out.println("Choose person from list.");
                        boolean isExists = false;
                        String s = sc.next();
                        for (Entry<Person, List<Pet>> entry : ZooClub.map.entrySet()) {
                            if (s.equals(entry.getKey().getName())) {
                                isExists = true;
                                System.out.println("Person exists.");
                            }
                        }
                        if (!isExists) {
                            System.err.println("Person not found.");
                            menu();
                            break;
                        } else {
                            System.out.println("Enter animal kind");
                            String kind = sc.next();
                            System.out.println("Enter animal name");
                            String name = sc.next();
                            for (Entry<Person, List<Pet>> entry : ZooClub.map.entrySet()) {
                                if (s.equals(entry.getKey().getName()))
                                    entry.getValue().add(new Pet(kind, name));
                            }
                            break;
                        }
                    }
                    case "3": {
                        System.out.println("Choose member for delete his animal");
                        boolean isExists = false;
                        String s = sc.next();
                        for (Entry<Person, List<Pet>> entry : ZooClub.map.entrySet()) {
                            if (s.equals(entry.getKey().getName()))
                                isExists = true;

                        }
                        if (!isExists) {
                            System.err.println("Person not found.");
                            menu();
                            break;
                        } else {

                            System.out.println("Person exists. Choose animal name");
                            String name = sc.next();
                            boolean isExistsPet = false;
                            for (Entry<Person, List<Pet>> entry : ZooClub.map.entrySet()) {
                                if (s.equals(entry.getKey().getName())) {
                                    for (int i = 0; i < entry.getValue().size(); i++) {
                                        if (entry.getValue().get(i).getName().equals(name)) {
                                            entry.getValue().remove(i);
                                            isExistsPet = true;
                                        }
                                    }
                                }
                            }
                            if (!isExistsPet) {
                                System.err.println(s + " has`t pet with name " + name);
                                break;
                            }
                            System.out.println("Animal deleted.");
                            break;
                        }
                    }
                    case "4": {
                        System.out.println("Choose member for delete him from zoo-club");
                        boolean isExists = false;
                        String s = sc.next();
                        for (Entry<Person, List<Pet>> entry : ZooClub.map.entrySet()) {
                            if (s.equals(entry.getKey().getName()))
                                isExists = true;
                        }
                        if (!isExists) {
                            System.err.println("Person with name `" + s + "` not found.");
                            menu();
                            break;
                        } else {
                            System.out.println("Deleting person.");
                            ZooClub.map.entrySet().removeIf(next -> s.equals(next.getKey().getName()));
                            break;
                        }
                    }
                    case "5": {
                        System.out.println("Choose animal type for delete it from everywhere");
                        String type = sc.next();
                        for (Entry<Person, List<Pet>> entry : ZooClub.map.entrySet()) {
                            List<Pet> pets = entry.getValue();
                            pets.removeIf(pet -> pet.getType().equals(type));
                        }
                        System.out.println("Animals deleted.");
                        break;
                    }
                    case "6": {
                        if (ZooClub.map.size() > 0)
                            for (Entry<Person, List<Pet>> entry : ZooClub.map.entrySet()) {
                                System.out.println(entry.getKey() + "\t--->" + entry.getValue());
                            }
                        else {
                            System.out.println("zoo-club empty now. Add new persons.");
                        }
                        break;
                    }
                    case "menu": {
                        menu();
                        break;
                    }
                }
            }

        } catch (Exception e) {
            System.err.println("Input mistake, try again. " + e);
        }
    }
}
