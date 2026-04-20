public class SubscriptionPayroll {

	// end of each month
	public void run() {
		PaymentTransfer processor = PaymentTransferFactory.getInstance();
		// H.W.
		// PaymentTransfer processor2 = new AsiaPayTransfer();

		processor.transfer(1, 2, 1000);
	}
}
