public abstract class Display {
    protected int width;
    protected int height;

    public Display(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public abstract String show();
}

