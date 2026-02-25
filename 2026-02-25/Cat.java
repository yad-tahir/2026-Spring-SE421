import module java.base;

public class Cat {

	public String city;
	public float age;

	public void sayHello() {
		say("hello");
	}

	public void say(String sentence) {
		// Whitespace split
		String[] words = sentence.split("\\s+");

		for (String word : words) {
			System.out.print("Meow ");
		}

		System.out.println();
	}

	public int getBornYear() {
		int currentYear = LocalDate.now().getYear();
		return (int) (currentYear - age);
	}
}
