import module java.base;

public class Cat {

	public static String city;
	private float age;

	// static {
	// System.out.println("Cat static block");
	// }

	// private Cat() {
	// }

	public Cat() {
		this(-1f);
		System.out.println("Cat constructor is called");
	}

	public Cat(float age) {
		System.out.println("Second Cat constructor is called");
		this.age = age;
	}

	// private void init() {
	// }

	public int getBornYear() {
		int currentYear = LocalDate.now().getYear();
		return (int) (currentYear - this.age);
	}
}
