import javax.inject.Inject;
import javax.inject.Qualifier;

public class SubscriptionPayroll {

	private PaymentTransfer instance;

	@Inject
	public SubscriptionPayroll(PaymentTransfer processor, @AppName String name) {
		this.instance = processor;
	}

	// end of each month
	public void run() {
		PaymentTransfer processor = instance;
		processor.transfer(1, 2, 1000);
	}
}
