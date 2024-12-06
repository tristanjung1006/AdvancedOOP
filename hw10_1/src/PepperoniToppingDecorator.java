class PepperoniToppingDecorator extends PizzaDecorator {
    public PepperoniToppingDecorator(AbstractPizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return "페퍼로니 " + pizza.getName();
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + ToppingsPrice.PEPPERONI;
    }
}
