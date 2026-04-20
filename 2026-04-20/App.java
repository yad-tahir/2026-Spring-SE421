public class App {

	void main() {
		// PaymentManager p = new PaymentManager();
		// p.transfer(1, 100, 1000, TransferType.ASIAPAY);
		// p.transfer(1, 100, 1000, TransferType.MASTERCARD);

		AsiaPayTransfer asiaPay = new AsiaPayTransfer();
		PaymentManager p = new PaymentManager(asiaPay);
		p.transfer(1, 100, 1000);

		PaymentManager p2 = new PaymentManager(new VisaTransfer());
		p.transfer(1, 100, 1000);

		// PaymentManager p = new PaymentManager();

		// p.transfer(1, 100, 1000, new AsiaPayTransfer());
		// p.transfer(1, 100, 1000, new MasterCardTransfer());
	}
}
