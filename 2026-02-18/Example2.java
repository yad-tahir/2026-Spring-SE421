public class Example2 {

	void main() {
		loop1();
		loop2();
		loop1();
	}

	void loop1() {
		for (int i = 0; i < 5; i++) {
			System.out.print("loop1:\t");
			System.out.print(i);
			System.out.println();
		}
	}

	void loop2() {
		for (int j = 0; j < 10; j++) {
			System.out.print("loop2:\t\t");
			System.out.print(j);
			System.out.println();
		}
	}
}
