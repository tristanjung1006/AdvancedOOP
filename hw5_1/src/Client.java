public class Client {
    public static void main(String[] args) {
        Item item1 = new Item("Shampoo", 3000);
        Item item2 = new Item("Cookie", 1000);
        Sale sale = new Sale();
        sale.add(item1);
        sale.add(item2);
        sale.printReceipt();

        String receipt = "Shampoo3000Cookie1000";

        // Fake Printer 사용
        HD108ReceiptPrinter fakePrinter = new HD108ReceiptPrinter();
        fakePrinter.printReceipt(receipt);

        // Real Printer 사용
        HD108ReceiptPrinter realPrinter = new HD108ReceiptPrinter();
        realPrinter.printReceipt(receipt);
    }
}