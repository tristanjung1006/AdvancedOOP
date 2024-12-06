import java.util.Random;

class MyRandom {
    private static Random random = new Random();

    public static int randInt(int min, int max) {
        return random.nextInt(max - min) + min;
    }
}

