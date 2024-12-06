package enumClass;

public enum Singleton {
    // 본질적으로 enum 키워드는 final 클래스이기 때문에 상속이 되지 않고 INSTANCE는 단일로 존재한다
    // 가장 간결하고 상속을 받지 않는다면 가장 효율적인 것 같다
    INSTANCE;

    public void test() {
        System.out.println("test");
    }
}
