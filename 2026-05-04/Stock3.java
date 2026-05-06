public class Stock3 {
	private String symbol;
	private float price;
	private GUI dashboard;

	public Stock3(GUI dashboard) {
		this.dashboard = dashboard;
	}

	private void notifyDashboard() {
		dashboard.update();
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
