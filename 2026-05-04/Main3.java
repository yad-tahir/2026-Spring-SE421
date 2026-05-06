public class Main3 {
	void main() {
		GUI stockDashboard = new GUI();
		Stock3 appleStock = new Stock3(stockDashboard);

		System.out.println("Setting symbol...");
		appleStock.setSymbol("AAPL");

		System.out.println("\nSetting price...");
		appleStock.setPrice(150.50f);

	}

}
