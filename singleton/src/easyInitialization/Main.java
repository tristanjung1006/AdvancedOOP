package easyInitialization;

public class Main {
    public static void main(String[] args) {
        // Singleton 인스턴스에 접근
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.test();
        System.out.println(s1);
        System.out.println(s2);
    }
}
