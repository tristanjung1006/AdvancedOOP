class Mouse extends AbstractExternalDevice {
    private final double space;

    public Mouse() {
        super("Mouse");
        this.space = 30.0;
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

