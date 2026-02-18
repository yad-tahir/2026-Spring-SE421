public class Homework {
	void main() {
		// 1 - How does the compound procedure 'calculate' work?
		// 2- Runtime Exception with odd numbers, e.g. calculate(5)
		System.out.println(calculate(5));
	}

	int calculate(int value) {
		if (value <= 0)
			return 0;

		return value + calculate((value - 1) ^ 1);
	}

}
