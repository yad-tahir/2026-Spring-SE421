public class Main2 {
	void main() {
		Stock appleStock = new Stock();
		appleStock.setSymbol("APPL");
		appleStock.setPrice(102f);

		GUI2 dashboard = new GUI2(appleStock);
		dashboard.startPolling();

	}

}
