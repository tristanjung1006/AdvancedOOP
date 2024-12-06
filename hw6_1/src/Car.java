public class Car {
    private int num = 10000;
    public int getCarNum() {
        synchronized (this) {
            num++;
            System.out.println(num);
        }
        return num;
    }
}
