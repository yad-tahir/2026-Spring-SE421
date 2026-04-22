public class PaymentManager {
	private PaymentTransfer strategy;

	public PaymentManager(PaymentTransfer method) {
		this.strategy = method;
	}

	public void transfer(int from, int to, int amount) {
		strategy.transfer(from, to, amount);
	}
}
