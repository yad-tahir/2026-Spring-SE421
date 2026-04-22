import com.google.inject.*;

public class HRModule extends AbstractModule {
	@Override
	protected void configure() {
		// bind(PaymentTransfer.class).to(ZenCashTransfer.class);
	}

	@Provides
	static PaymentTransfer providePaymentTransfer() {
		return new ZenCashTransfer();
	}

	@Provides
	@AppName
	static String getAppName() {
		return "HR App";
	}

}
