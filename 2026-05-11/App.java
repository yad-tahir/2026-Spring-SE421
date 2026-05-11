public class App {
	void main() {

		Student s1 = new Student(2, 3.2f);

		// s1 = new Student(s1.getId(), 3.4f);
		s1 = s1.setGpa(3.4f)
				.setId(4);

		// s1 = new Student(4, s1.getGpa());
		// s1 = s1.setId(4);

		Student s2 = new Student();
		s2 = s2.setId(5).setGpa(3.8f);
	}
}
