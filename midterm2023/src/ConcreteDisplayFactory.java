public class ConcreteDisplayFactory implements DisplayFactory {
    @Override
    public TitleDisplay createTitleDisplay(String title, int width, int height) {
        return new TitleDisplay(title, width, height);
    }

    @Override
    public Display createDecoratorDisplay(String type, int width, int height) {
        return switch (type.toLowerCase()) {
            case "speed" -> new SpeedDisplay(width, height);
            case "weather" -> new WeatherDisplay(width, height);
            case "time" -> new TimeDisplay(width, height);
            default -> null;
        };
    }
}

