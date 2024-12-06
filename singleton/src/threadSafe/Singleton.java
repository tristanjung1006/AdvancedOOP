package threadSafe;

// thread-safe한 방식
// 해당 메서드에 스레드가 하나씩 접근할 수 있도록 한다
// 하지만 여러 개의 모듈들이 매번 객체를 가져올 때마다 synchronized 메서드를 한 번씩 호출하기 땨문에 동기화 처리 작업에 오버헤드가 발생할 수 있다


public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    // getInstance() 메서드에 동시 접근이 있을 경우, 한 스레드가 작업이 끝날 때까지 대기하므로 인스턴스 중복 생성을 방지할 수 있다
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void test() {
        System.out.println("test");
    }
}

