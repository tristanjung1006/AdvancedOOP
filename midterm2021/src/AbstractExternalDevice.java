abstract class AbstractExternalDevice extends AbstractNotebookComputer {
    protected String deviceType;

    public AbstractExternalDevice(String deviceType) {
        this.deviceType = deviceType;
    }

    @Override
    public String toString() {
        return deviceType;
    }
}

