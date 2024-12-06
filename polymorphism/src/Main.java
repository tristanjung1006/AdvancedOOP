public class Main {
    public static void main(String[] args) {
        ShapeTag s1 = new ShapeTag("shape1");
        ShapeTag s2 = new ShapeTag("shape2");

        RectangleTag r = new RectangleTag("shape", "rectangle");
        CircleTag c = new CircleTag("shape", "circle");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(r);
        System.out.println(c);
    }
}
