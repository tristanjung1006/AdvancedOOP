public abstract class PizzaStore {

	// Factory Method
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	// 각 매장에서 피자를 생성하는 메소드
	protected abstract Pizza createPizza(String type);
}