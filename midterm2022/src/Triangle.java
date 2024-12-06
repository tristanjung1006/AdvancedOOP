import java.util.Random;

class Triangle extends Shape {
    private String name;

    public Triangle(String name, int min, int max) {
        this.name = name;
        Random random = new Random();
        minX = random.nextInt(max - min) + min;
        minY = random.nextInt(max - min) + min;
        double x2 = random.nextInt(max - min) + min;
        double y2 = random.nextInt(max - min) + min;
        double x3 = random.nextInt(max - min) + min;
        double y3 = random.nextInt(max - min) + min;

        minX = Math.min(minX, Math.min(x2, x3));
        minY = Math.min(minY, Math.min(y2, y3));
        maxX = Math.max(maxX, Math.max(x2, x3));
        maxY = Math.max(maxY, Math.max(y2, y3));
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

