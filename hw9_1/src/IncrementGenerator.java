public class IncrementGenerator extends Subject {
    // Observer 패턴의 Subject 역할을 하는 클래스
    private int number;
    private int end;
    private int step;

    // IncrementGenerator 생성자
    public IncrementGenerator(int start, int end, int step) {
        this.end = end;
        this.step = step;
        this.number = start;
    }

    // 수 증가
    public void execute() {
        while (number <= end) {
            notifyObservers();
            number += step;
        }
    }

    // 수 반환
    public int getNumber() {
        return number;
    }
}
