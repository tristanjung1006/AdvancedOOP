class NotebookComputer extends AbstractNotebookComputer{
    private final String owner;
    private final double space;

    public NotebookComputer(String owner) {
        this.owner = owner;
        this.space = 250.0;
    }

    @Override
    double requiredSpace() {
        return space;
    }

    @Override
    public String toString() {
        return owner + "'s notebook computer";
    }
}
