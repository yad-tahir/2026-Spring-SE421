public class Main {
	void main() {
		Stock stock = new Stock();
		stock.setSymbol("APPL");
		stock.setPrice(102f);

		Stock old = new Stock(stock);

		API.magic(stock);

		// API.magic(new Stock(stock));

		if (stock.equals(old)) {
			// nothing changed
		}

	}

	void method1(int x) {
		x++;
	}

}
