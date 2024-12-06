import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    private List<Command> operations = new ArrayList<>();

    // 새로운 Command 인스턴스 추가
    public void addOperation(Command command) {
        operations.add(command);
    }

    // Command 인스턴스 순차적 실행
    public void performOperations() {
        for (Command command : operations) {
            command.execute();
        }
    }
}