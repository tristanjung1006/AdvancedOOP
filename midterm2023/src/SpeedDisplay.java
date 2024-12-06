import java.util.Random;

public class SpeedDisplay extends Display {
    public SpeedDisplay(int width, int height) {
        super(width, height);
    }

    @Override
    public String show() {
        Random rand = new Random();
        int speed = 40 + rand.nextInt(11); // 40~50 km/h
        return "Speed: " + speed + " km/h";
    }
}

