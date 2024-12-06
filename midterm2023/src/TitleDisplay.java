public class TitleDisplay extends Display {
    private final String title;

    public TitleDisplay(String title, int width, int height) {
        super(width, height);
        this.title = title;
    }

    @Override
    public String show() {
        return "Title: " + title;
    }
}

