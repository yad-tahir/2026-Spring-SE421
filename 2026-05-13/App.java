public class App {
	void main() {

		Student s1 = new Student(2, 3.2f);

		s1 = s1.setGpa(3.4f)
				.setId(4);

		Student old = s1;
		s1 = method2(s1);
		// whether anything in s1 has changed
		// if (old == s1) {
		// // no change
		// }
		s1 = old;
		// old = null;
	}

	void method1(Student arg) {
		arg = arg.setId(20);
	}

	Student method2(Student arg) {
		// 150 lines code that may change the student arg
		return arg;
	}
}
