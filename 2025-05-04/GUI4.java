public class GUI4 implements StockListener {

	public void update() {
		// 100 lines of code to update the UI
		System.out.println("UI Refreshed!");
	}

	@Override
	public void onStockChanged(Stock stock) {
		System.out.println("Detected change in stock: " + stock.getSymbol() + " | New Price: $" + stock.getPrice());
		// Call the UI update method whenever the stock changes
		update();
	}
}
