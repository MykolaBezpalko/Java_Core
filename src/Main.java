import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Class<?> c = Testing.class;
        System.out.println("Test class name is: " + c.getSimpleName());
        System.out.println("Package is: " + c.getPackage());


        Field[] fields = c.getDeclaredFields();
        System.out.println("\nFields of Testing class: ");
        for (int i = 0; i < fields.length; i++) {
            Field f = fields[i];
            String m = Modifier.toString(f.getModifiers());
            System.out.println(m + "\t " + f.getType() + " " + f.getName());
        }

        System.out.println("\nConstructors of Testing class: ");
        Constructor<?>[] cons = c.getDeclaredConstructors();
        for (Constructor x : cons) {
            System.out.println(x);
        }

        Constructor<?> myConstructor = cons[0];
        Testing obj = (Testing) myConstructor.newInstance("Testing object #1", 11);
        System.out.println("\n" + obj);

        Field value = fields[0];
        Field flag = fields[4];
        flag.set(obj, true);
        value.set(obj, 999);
        System.out.println(obj);

        Constructor<?> myConstructor2 = cons[1];
        Testing obj2 = (Testing) myConstructor2.newInstance(55, "Testing object #2", true);
        System.out.println("\n" + obj2);
        Field pValue = fields[1];
        pValue.setAccessible(true);
        pValue.set(obj2, 555);
        System.out.println(obj2);

        System.out.println("\nMethods of Testing class: ");
        Method[] methods = c.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m);
        }

        System.out.println();
        Method myMethod = c.getDeclaredMethod("myMethod", null);
        myMethod.invoke(obj);

        Method mySecondMethod = c.getDeclaredMethod("mySecondMethod", String.class);
        mySecondMethod.invoke(obj2, "Get this method for object #2");
    }
}
