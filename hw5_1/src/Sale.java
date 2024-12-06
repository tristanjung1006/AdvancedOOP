import java.util.ArrayList;
import java.util.Iterator;

public class Sale {
    private final ArrayList<Item> items = new ArrayList<>();
    private final HD108ReceiptPrinter printer = new HD108ReceiptPrinter();

    public void printReceipt() {
        Iterator<Item> itr = items.iterator();
        StringBuffer buf = new StringBuffer();
        while (itr.hasNext()) {
            Item item = itr.next();
            buf.append(item.getName());
            buf.append(" - ");
            buf.append(item.getPrice());
            buf.append("\n");
        }
        printer.print(buf);
    }

    public void add(Item item) {
        items.add(item);
    }
}