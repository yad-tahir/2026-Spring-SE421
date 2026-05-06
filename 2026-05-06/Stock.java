import java.util.Objects;

public class Stock {
	private String symbol;
	private float price;
	private Market market;

	public Stock() {
	}

	public Stock(Stock other) {
		this.price = other.price;
		this.symbol = other.symbol;
		this.market = other.market;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Market getMarket() {
		return this.market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}

		Stock other = (Stock) obj;

		return this.price == other.price &&
				this.symbol.equals(other.symbol) &&
				this.market.equals(other.market);

		// this.market.getLocation().equals(other.market.getLocation())&&
		// this.market.getName().equals(other.market.getName());

	}
}
