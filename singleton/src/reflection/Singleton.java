package reflection;

import java.lang.reflect.Constructor;

// bill pugh 방식을 깨부순다
public class Singleton {
    private Singleton() {}

    public static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void test() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        try {
            Singleton instance1 = Singleton.getInstance();
            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            Singleton instance2 = constructor.newInstance();

            System.out.println(instance1 == instance2); // false
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
