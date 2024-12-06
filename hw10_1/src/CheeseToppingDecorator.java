class CheeseToppingDecorator extends PizzaDecorator {
    public CheeseToppingDecorator(AbstractPizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return "치즈 " + pizza.getName();
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + ToppingsPrice.CHEESE;
    }
}
