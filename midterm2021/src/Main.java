import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NotebookComputer notebook = new NotebookComputer("Yongjoo");
        System.out.println("노트북 생성. 요구 공간: " + notebook.requiredSpace());

        ArrayList<AbstractExternalDevice> devices = new ArrayList<>();
        System.out.println("Devices: " + notebook);

        double totalSpace = notebook.requiredSpace();
        System.out.println("Required space: " + totalSpace + "\n");

        for (int i = 0; i < 2; i++) {
            LEDMonitor monitor = new LEDMonitor();
            devices.add(monitor);
            totalSpace += monitor.requiredSpace();
            System.out.println("외부 모니터 추가. 요구 공간: " + monitor.requiredSpace() + " 추가");
            System.out.println("Devices: " + notebook + ", " + getDeviceList(devices));
            System.out.println("Required space: " + totalSpace + "\n");
        }

        Keyboard keyboard = new Keyboard();
        devices.add(keyboard);
        totalSpace += keyboard.requiredSpace();
        System.out.println("외부 키보드 추가. 요구 공간: " + keyboard.requiredSpace() + " 추가");
        System.out.println("Devices: " + notebook + ", " + getDeviceList(devices));
        System.out.println("Required space: " + totalSpace + "\n");

        Mouse mouse = new Mouse();
        devices.add(mouse);
        totalSpace += mouse.requiredSpace();
        System.out.println("외부 마우스 추가. 요구 공간: " + mouse.requiredSpace() + " 추가");
        System.out.println("Devices: " + notebook + ", " + getDeviceList(devices));
        System.out.println("Required space: " + totalSpace + "\n");

        HardDrive hardDrive = new HardDrive();
        devices.add(hardDrive);
        totalSpace += hardDrive.requiredSpace();
        System.out.println("하드 드라이브 추가. 요구 공간: " + hardDrive.requiredSpace() + " 추가");
        System.out.println("Devices: " + notebook + ", " + getDeviceList(devices));
        System.out.println("Required space: " + totalSpace);
    }

    private static String getDeviceList(ArrayList<AbstractExternalDevice> devices) {
        StringBuilder sb = new StringBuilder();
        for (AbstractExternalDevice device : devices) {
            sb.append(device).append(", ");
        }
        return sb.substring(0, sb.length() - 2); // Remove the last comma and space
    }
}

