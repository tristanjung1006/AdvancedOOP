public class FakePrinter extends Printer {
    @Override
    public void print(String receipt) {
        System.out.println("Fake Print");
        System.out.println(receipt);
    }
}
