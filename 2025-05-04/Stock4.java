public class Stock4 {
	private String symbol;
	private float price;
	private StockListener listener;

	public Stock4(StockListener listener) {
		this.listener = listener;
	}

	private void notifyDashboard() {
		listener.onStockChanged(this); // Stock data type is required; so change the class name to Stock
	}

	public String getSymbol() {
		return this.symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
		notifyDashboard();
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
		notifyDashboard();
	}
}
