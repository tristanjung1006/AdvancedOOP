abstract class Shape {
    protected double minX, minY, maxX, maxY;

    public abstract void calcBounds();

    public double getMinX() {
        return minX;
    }

    public double getMinY() {
        return minY;
    }

    public double getMaxX() {
        return maxX;
    }

    public double getMaxY() {
        return maxY;
    }

    public abstract String getShapeName();

    @Override
    public String toString() {
        return getShapeName() + " Bounding Box: [" + minX + ", " + minY + ", " + maxX + ", " + maxY + "]";
    }
}

