public class Main5 {
	void main() {
		Stock5 appleStock = new Stock5();

		GUI4 stockDashboard = new GUI4();
		appleStock.addListener(stockDashboard);

		System.out.println("Setting symbol...");
		appleStock.setSymbol("AAPL");

		System.out.println("\nSetting price...");
		appleStock.setPrice(150.50f);

	}

}
