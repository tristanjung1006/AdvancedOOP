public class Main {
    public static void main(String[] args) {
        System.out.println("과제명: Command Pattern 구현");
        System.out.println("작성자: 정승원");
        System.out.println();

        // CommandManager 인스턴스 생성
        CommandManager mgr = new CommandManager();

        mgr.addOperation(new AddValueCommand(2, 3));
        mgr.addOperation(new SubtractValueCommand(2, 3));
        mgr.addOperation(new SquareValueCommand(3));

        mgr.performOperations();
    }
}