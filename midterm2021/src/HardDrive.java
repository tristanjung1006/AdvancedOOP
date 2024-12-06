class HardDrive extends AbstractExternalDevice {
    private final double space;

    public HardDrive() {
        super("HardDrive");
        this.space = 40.0;
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
