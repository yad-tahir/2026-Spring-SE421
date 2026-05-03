public class Main4 {
	void main() {
		GUI4 stockDashboard = new GUI4();
		Stock4 appleStock = new Stock4(stockDashboard);
		// Stock4 objStock = new Stock4(new StockListener() {

		// void onStockChanged(Stock stock){
		// System.out.println("AUIS");
		// }
		// });

		System.out.println("Setting symbol...");
		appleStock.setSymbol("AAPL");

		System.out.println("\nSetting price...");
		appleStock.setPrice(150.50f);

	}

}
