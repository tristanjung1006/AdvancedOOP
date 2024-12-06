public class AddValueCommand implements Command {
    private int a; // 1번째 피연산자
    private int b; // 2번째 피연산자

    // 덧셈
    public AddValueCommand(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // 덧셈 연산 수행
    @Override
    public void execute() {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}