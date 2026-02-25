public class Main {
	void main() {
		Cat tom = new Cat();
		tom.age = 2.5f;
		// tom.sayHello();
		// tom.say("Hello from auis and this is a SE421 class");

		Cat z = new Cat();
		z.age = 5f;

		System.out.println(tom.getBornYear());
		System.out.println(z.getBornYear());

		Cat.city = "Suly";
		System.out.println(tom.city);
		System.out.println(z.city);
		System.out.println(Cat.city);

		// System.out.println(tom.age);
		// System.out.println(z.age);

		// z = tom;

		// z.age = 6f;
		// System.out.println(tom.age);
		// System.out.println(z.age);
	}
}
