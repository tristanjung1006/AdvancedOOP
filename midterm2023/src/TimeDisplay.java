import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDisplay extends Display {
    public TimeDisplay(int width, int height) {
        super(width, height);
    }

    @Override
    public String show() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        return "Time: " + formatter.format(new Date());
    }
}

