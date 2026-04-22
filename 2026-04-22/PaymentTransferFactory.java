public class PaymentTransferFactory {

	public static PaymentTransfer instance = null;

	public static PaymentTransfer getInstance() {
		if (instance != null)
			return instance;
		return new AsiaPayTransfer();
		// return new ZenCashTransfer();
	}

	public static void setIntance(PaymentTransfer useInstance) {
		instance = useInstance;
	}
}
