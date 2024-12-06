public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYCheesePizza();
        } else if (item.equals("pepperoni")) {
            return new NYPepperoniPizza();
        } else {
            return null;
        }
    }
}
