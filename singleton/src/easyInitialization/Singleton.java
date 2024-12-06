package easyInitialization;

// eager initialization
// Singleton 객체가 무조건 인스턴스를 하나 생성하는 구조이기 때문에 객체를 사용하지 않는 상황에서는 원치 않는 인스턴스가 생성된다
// 인스턴스 생성을 1번만 하므로 메모리 낭비를 방지할 수 있다
// 인스턴스 생성이 계속해서 일어나는 것이 아니기 때문에 속도가 더 빨라질 수 있다

// 생성자가 private이라서 상속이 불가능하다

public class Singleton {
    // 정적 변수로 인스턴스 생성
    // 싱글톤 인스턴스 생성시 final 키워드는 생성과 동시에 초기화
    // final 키워드를 사용하면 동적인 초기화를 하지 못함

    private static Singleton instance;

    // 생성자를 private으로 설정해서 외부에서 인스턴스를 생성할 수 없도록 함
    private Singleton() {}

    // 인스턴스를 반환하는 메서드
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void test() {
        System.out.println("test");
    }
}
