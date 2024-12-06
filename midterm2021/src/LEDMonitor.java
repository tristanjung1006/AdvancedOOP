class LEDMonitor extends AbstractExternalDevice {
    private final double space;

    public LEDMonitor() {
        super("LEDMonitor");
        this.space = 150.0;
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

