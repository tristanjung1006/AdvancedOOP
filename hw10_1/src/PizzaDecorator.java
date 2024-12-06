abstract class PizzaDecorator extends AbstractPizza {
    protected AbstractPizza pizza;

    public PizzaDecorator(AbstractPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getSize() {
        return pizza.getSize();
    }

    @Override
    public String getName() {
        return pizza.getName();
    }

    @Override
    public int getPrice() {
        return pizza.getPrice();
    }
}
