public class PaymentManager {
	private PaymentTransfer strategy;

	public PaymentManager(PaymentTransfer method) {
		this.strategy = method;
	}

	public void transfer(int from, int to, int amount) {
		strategy.transfer(from, to, amount);
	}

	// public void transfer(int from, int to, int amount, TransferType type) {
	// if (type == TransferType.ASIAPAY) {
	// // call Asiapay API
	// // 30 lines of code
	// } else if (type == TransferType.MASTERCARD) {
	// // call Master card API
	// // 20 lines of code
	// } else if (type == TransferType.VISA) {
	// // call VISA API
	// // 50 lines of code
	// } else if (type == TransferType.ZENPAY) {
	// // call ZENPAY
	// // 10 lines of code
	// }
	// }
}
