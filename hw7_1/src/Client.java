public class Client {
    public static void main(String[] args) {
        System.out.println("hw7_1 정승원");

        Light light = new Light();

        light.on_button_pushed();
        light.on_button_pushed();
        light.on_button_pushed();
        light.off_button_pushed();
        light.on_button_pushed();
    }
}