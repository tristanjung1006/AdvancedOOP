public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoCheesePizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoPepperoniPizza();
        } else {
            return null;
        }
    }
}
