import java.util.ArrayList;
import java.util.List;

public class Stock5 {
	private String symbol;
	private float price;

	// List to keep track of all registered listeners
	private List<StockListener> listeners = new ArrayList<>();

	public void addListener(StockListener listener) {
		listeners.add(listener);
	}

	public void removeListener(StockListener listener) {
		listeners.remove(listener);
	}

	// Notify all registered listeners that a change occurred
	private void notifyListeners() {
		for (StockListener listener : listeners) {
			listener.onStockChanged(this);
		}
	}

	public String getSymbol() {
		return this.symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
		notifyListeners(); // Trigger notification on change
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
		notifyListeners(); // Trigger notification on change
	}
}
