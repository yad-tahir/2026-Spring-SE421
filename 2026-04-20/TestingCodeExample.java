public class TestingCodeExample {
	public void testing() {
		PaymentTransfer mock = new PaymentTransfer() {
			public void transfer(int a, int b, int amount) {
			}
		};
		PaymentTransferFactory.setIntance(mock);

		SubscriptionPayroll payroll = new SubscriptionPayroll();
		payroll.run();
	}
}
