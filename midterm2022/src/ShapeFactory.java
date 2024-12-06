class ShapeFactory implements ShapeFactoryInterface {
    @Override
    public Shape createShape(String type, int min, int max) {
        if (type.equalsIgnoreCase("Rectangle")) {
            return new Rectangle("Rectangle", min, max);
        } else if (type.equalsIgnoreCase("Triangle")) {
            return new Triangle("Triangle", min, max);
        }
        return null;
    }
}

