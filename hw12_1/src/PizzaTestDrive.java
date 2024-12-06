

public class PizzaTestDrive {

	public static void main(String[] args) {
		System.out.println("과제명: Factory Method Pattern");
		System.out.println("작성자: 정승원\n");

		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("We ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("We ordered a " + pizza.getName() + "\n");
	}

}
