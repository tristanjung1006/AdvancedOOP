public class SquareValueCommand implements Command {
    private int a;

    // 제곱할 숫자
    public SquareValueCommand(int a) {
        this.a = a;
    }

    // 제곱 연산 수행
    @Override
    public void execute() {
        System.out.println("pow(" + a + ", 2) = " + (a * a));
    }
}