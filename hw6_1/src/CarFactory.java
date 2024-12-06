public class CarFactory {
    private static CarFactory inst = new CarFactory();
    private static Car car = null;

    private CarFactory() { }
    public static CarFactory getInstance() {
        return inst;
    }

    public static Car createCar() {
        return car = new Car();
    }
}
