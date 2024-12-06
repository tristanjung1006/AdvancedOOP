public interface DisplayFactory {
    TitleDisplay createTitleDisplay(String title, int width, int height);
    Display createDecoratorDisplay(String type, int width, int height);
}

