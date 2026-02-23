public class Example1 {

	void main() {
		// int num = square(30);
		// System.out.println(num);

		// System.out.println(square(30));

		int num = sumSquares(3, 4);
		num = sumSquares(1 + 2, 2 + 2);
		System.out.println(num);
	}

	int sumSquares(int x, int y) {
		int result = square(x) + square(y);
		// int result = x*x + y*y;
		return result;
	}

	int square() {
		return 0;
	}

	int square(int x) {
		// int result = x * x;

		int result = Math.unsignedPowExact(x, 2);
		return result;
	}

}
