import com.google.inject.*;

public class DIApp {
	void main() {
		Injector injector = Guice.createInjector(new HRModule());

		SubscriptionPayroll payroll = injector.getInstance(SubscriptionPayroll.class);
		payroll.run();

		// Junit
		// SubscriptionPayroll payroll2 = new SubscriptionPayroll(new PaymentTransfer(){
		// public void transfer(int from, int to, int amount){
		// }
		// });
		// payroll2.run();
	}
}
