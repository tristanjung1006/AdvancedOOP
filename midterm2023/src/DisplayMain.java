import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisplayMain {
    // 학번: 20230001, 이름: 홍길동, ID: hkdong
    public static void main(String[] args) {

        System.out.println("Current working directory: " + System.getProperty("user.dir"));

        String filename = "src/midterm2023/displays.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String title = br.readLine();
            ConcreteDisplayFactory factory = new ConcreteDisplayFactory();
            TitleDisplay titleDisplay = factory.createTitleDisplay(title, 100, 30);
            System.out.println(titleDisplay.show());

            String line;
            while ((line = br.readLine()) != null) {
                Display display = factory.createDecoratorDisplay(line, 100, 30);
                if (display != null) {
                    System.out.println(display.show());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
