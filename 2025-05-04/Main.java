public class Main {
	void main() {
		Stock appleStock = new Stock();
		appleStock.setSymbol("APPL");
		appleStock.setPrice(102f);

		GUI dashboard = new GUI();

		// Tide appleStock and dashaboard together
		startPolling(appleStock, dashboard);
	}

	private String lastKnownSymbol;
	private float lastKnownPrice;

	void startPolling(Stock monitoredStock, GUI dashboard) {

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
				dashboard.update();
			}
		}
	}
}
