public class SubtractValueCommand implements Command {
    private int a;
    private int b;

    // 뺄셈 연산
    public SubtractValueCommand(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // 뺄셈 연산 수행
    @Override
    public void execute() {
        System.out.println(a + " - " + b + " = " + (a - b));
    }
}