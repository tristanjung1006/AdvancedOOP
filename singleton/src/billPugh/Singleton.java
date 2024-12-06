package billPugh;

public class Singleton {
    private Singleton() {}

    // 클래스 안에 정적 클래스를 생성한다
    // 해당 클래스 안에 인스턴스를 static final로 보유하고 있는다(static으로 메모리에 미리 할당하고 final로 불변성까지 가져간다)
    public static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void test() {
        System.out.println("test");
    }
}
