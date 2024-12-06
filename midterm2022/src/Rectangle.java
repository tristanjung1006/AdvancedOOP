import java.util.Random;

class Rectangle extends Shape {
    private String name;

    public Rectangle(String name, int min, int max) {
        this.name = name;
        Random random = new Random();
        minX = random.nextInt(max - min) + min;
        minY = random.nextInt(max - min) + min;
        maxX = minX + 30; // Width
        maxY = minY + 20; // Height
        calcBounds();
    }

    @Override
    public void calcBounds() {
        // Bounds are already calculated in the constructor
    }

    @Override
    public String getShapeName() {
        return name;
    }
}

