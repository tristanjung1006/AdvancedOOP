
class Pizza extends AbstractPizza{
    private int size;
    private String name;
    private int price;

    public Pizza(int size) {
        this.size = size;
        this.name = "피자";
        this.price = 20000;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
