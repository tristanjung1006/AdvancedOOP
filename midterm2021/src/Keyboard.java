class Keyboard extends AbstractExternalDevice {
    private final double space;

    public Keyboard() {
        super("Keyboard");
        this.space = 80.0;
    }

    @Override
    double requiredSpace() {
        return space;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

