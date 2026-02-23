public class Example2 {

	void main() {

		// BAD
		// 1- creating a variable called x that takes 8 bytes
		long x;
		loop1(); // BAD: this function creates a loop to print some numbers
		loop2();
		loop1();
	}

	void loop1() {
		// BAD: loop 1 to 4
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
