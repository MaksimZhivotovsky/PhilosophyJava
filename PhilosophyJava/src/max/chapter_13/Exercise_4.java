package max.chapter_13;

import java.util.Formatter;

public class Exercise_4 {
    private static final int ITEM_WIDTH = 15;
    private static final int QTY_WIDTH = 5;
    private static final int PRICE_WIDTH = 10;
    private static final String TITLE_FORMAT = "%-" + ITEM_WIDTH + "s %" + QTY_WIDTH + "s %" + PRICE_WIDTH + "s\n";
    private static final String ITEM_FORMAT = "%-" + ITEM_WIDTH + "." + ITEM_WIDTH + "s %" + QTY_WIDTH + "d %" +
            PRICE_WIDTH ;
    private static final String TOTAL_FORMAT = "%-" + ITEM_WIDTH + "s %" + QTY_WIDTH + "s %" + PRICE_WIDTH;
	public Exercise_4() {
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("Jack's Magic Beans", 4, 4.25);
		receipt.print("Princess Peas", 3, 5.1);
		receipt.print("Three Bears Porridge", 1, 14.29);
		receipt.printTotal();

	}
	
	private class Receipt {
		private double total = 0;
		private Formatter f = new Formatter(System.out);
		public void printTitle() {
			f.format(TITLE_FORMAT, "Item", "Qty", "Price");
			f.format(TITLE_FORMAT, "--- ", "---", "----- ");
		}
		public void print(String name, int qty, double price) {
			f.format(ITEM_FORMAT +  ".2f\n", name, qty, price);
			total += price;
		}
		public void printTotal() {
	        f.format(TOTAL_FORMAT + ".2f\n", "Tax", "", total * 0.06);
	        f.format(TOTAL_FORMAT + "s\n", "", "", "-----");
	        f.format(TOTAL_FORMAT + ".2f\n", "Total", "", total * 1.06);
		}
	}
}
