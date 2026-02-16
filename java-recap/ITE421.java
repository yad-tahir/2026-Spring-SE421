public class ITE421 {
	void main() {
		int x = 11;
		// System.out.println("Hello world " + x);

		// x = 011; // octa number
		// System.out.println("Hello world " + x);

		// x = 0xff; // hexa number
		// System.out.println(x);

		// long y = 12;
		// float m = 10.2f;
		// m = (float) 10.2;
		// double n = 10.3;

		// String name = "Ali";
		// var name = "Ali";

		int x = 20;
		if (x > 0) {
			// true
			System.out.println(true);
		} else {
			// false
			System.out.println(false);
			System.out.println(false);
			System.out.println(false);
			System.out.println(false);
		}

		int day = 1;
		int result = 0;

		int k = 20;
		if (k % 2 != 0) {
			// throw an error
			return;
		}
		// send email message
		// send email message
		// send email message
		// send email message
		// send email message
		// send email message
		// insert students data
		// insert students data
		// insert students data
		// insert students data
		// insert students data
		// insert students data

		switch (day) {
			case 0:
				result = 0;
				break;
			case 1:
				result = 10;
				break;
			case 2:
				result = 20;
				break;
			default:
				result = -1;
		}

		result = switch (day) {
			case 0 -> 0;
			case 1 -> 10;
			case 2 -> 20;
			default -> -1;
		};

	}
}
