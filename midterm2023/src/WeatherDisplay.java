import java.util.Random;

public class WeatherDisplay extends Display {
    public WeatherDisplay(int width, int height) {
        super(width, height);
    }

    @Override
    public String show() {
        Random rand = new Random();
        int temperature = 15 + rand.nextInt(11); // 15~25 degrees Celsius
        return "Weather: " + temperature + " °C";
    }
}

