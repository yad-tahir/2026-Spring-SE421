public class App {
	void main() {
		Employee e1 = new Employee(20);
		// direct
		// e1.fullName;
		// e1.fullName = "Tahir";

		// vs indirect
		System.out.println(e1.getName());
		e1.setName("Tahir");

		// e1.id;

		// System.out.println(e1.id);
		System.out.println(e1.getId());
		System.out.println(e1.getSalary());
		System.out.println(e1.getName());

		// e1.id = 20;
		// e1.setId(20);
		// e1.setId(21);

		// e1.name = "Tahir";
		e1.setName("Tahir");

		// e1.salary = -2000;
		e1.setSalary(-2000);

		// e1.id += 1;
		// e1.name = null;
	}
}
