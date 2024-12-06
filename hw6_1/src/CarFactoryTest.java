public class CarFactoryTest{

    public static void main(String[] args) {

        CarFactory factory = CarFactory.getInstance();	// 싱글톤 패턴



        Car myCar = CarFactory.createCar();				// 메서드에서 Car 생성

        Car yourCar = CarFactory.createCar();

        System.out.println("hw6_1 정승원");

        System.out.println(myCar.getCarNum());		// 10001 출력

        System.out.println(yourCar.getCarNum());		// 10002 출력

    }

}