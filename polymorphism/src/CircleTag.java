public class CircleTag extends ShapeTag{
    private String circleTag;

    public CircleTag(String tag, String circleTag) {
        super(tag);
        this.circleTag = circleTag;
    }

    @Override
    public String toString() {
        return  "#" + circleTag + " " + super.toString();
    }

    public String getCircleTag() {
        return circleTag;
    }
}
