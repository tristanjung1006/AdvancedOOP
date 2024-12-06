public class HD108ReceiptPrinter {
    private final Printer printer;

    public HD108ReceiptPrinter() {
        this.printer = new Printer();
    }

    public void print(StringBuffer buf) {
        printer.print(buf.toString());
    }

    public void printReceipt(String receipt) {
        printer.print(receipt);
    }

    public static void main(String[] args) {
        HD108ReceiptPrinter receiptPrinter = new HD108ReceiptPrinter();
        receiptPrinter.printReceipt("영수증 기타정보");
    }
}