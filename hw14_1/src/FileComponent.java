public abstract class FileComponent {
    protected int depth = 0;

    public abstract int getSize();
    public abstract void print();
    public void setDepth(int depth) {
        this.depth = depth;
    }
}

