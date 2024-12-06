package doubleCheckLocking;

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    // if문으로 말 그대로 더블 체크를 통해서 synchronized 블록 실행을 의무화하지 않는다
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    public void test() {
        System.out.println("test");
    }
}

