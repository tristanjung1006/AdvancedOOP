public class Main {
    public static void main(String[] args) {
        ShapeFactoryInterface shapeFactory = new ShapeFactory();

        Shape rectangle = shapeFactory.createShape("Rectangle", 10, 100);
        System.out.println(rectangle);

        Shape triangle = shapeFactory.createShape("Triangle", 10, 100);
        System.out.println(triangle);

        Group group1 = new Group("Group 1", rectangle, triangle);
        System.out.println(group1);

        Shape rectangle2 = shapeFactory.createShape("Rectangle", 10, 100);
        Group group2 = new Group("Group 2", group1, rectangle2);
        System.out.println(group2);
    }
}

