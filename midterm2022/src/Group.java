class Group implements ShapeDecorator {
    private String groupName;
    private Shape existingShape;
    private Shape newShape;

    public Group(String groupName, Shape existingShape, Shape newShape) {
        this.groupName = groupName;
        this.existingShape = existingShape;
        this.newShape = newShape;
        calcBounds();
    }

    @Override
    public void calcBounds() {
        minX = Math.min(existingShape.getMinX(), newShape.getMinX());
        minY = Math.min(existingShape.getMinY(), newShape.getMinY());
        maxX = Math.max(existingShape.getMaxX(), newShape.getMaxX());
        maxY = Math.max(existingShape.getMaxY(), newShape.getMaxY());
    }

    @Override
    public String toString() {
        return groupName + " Bounding Box: [" + minX + ", " + minY + ", " + maxX + ", " + maxY + "]\n" +
                "Contains: \n" + existingShape + "\n" + newShape;
    }

    @Override
    public String getShapeName() {
        return groupName;
    }
}

