public class GUI2 {
	private Stock monitoredStock;
	private String lastKnownSymbol;
	private float lastKnownPrice;

	public GUI2(Stock stock) {
		this.monitoredStock = stock;
		this.lastKnownSymbol = stock.getSymbol();
		this.lastKnownPrice = stock.getPrice();
	}

	public void update() {
		// 100 lines of code to update the UI
		System.out.println("UI Refreshed!");
	}

	public void startPolling() {
		System.out.println("Entering infinite loop. Say goodbye to the rest of your program...");

		while (true) {
			boolean hasChanged = false;

			String currentSymbol = monitoredStock.getSymbol();
			if ((currentSymbol != null && !currentSymbol.equals(lastKnownSymbol)) ||
					(currentSymbol == null && lastKnownSymbol != null)) {
				lastKnownSymbol = currentSymbol;
				hasChanged = true;
			}

			float currentPrice = monitoredStock.getPrice();
			if (currentPrice != lastKnownPrice) {
				lastKnownPrice = currentPrice;
				hasChanged = true;
			}

			if (hasChanged) {
				System.out.println("Detected change! New Price: $" + lastKnownPrice);
				update();
			}
		}

	}
}
