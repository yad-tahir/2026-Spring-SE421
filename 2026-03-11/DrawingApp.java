public class DrawingApp {
	void main() {

		// Shape s = new Shape("blue");
		// Circle c = new Circle("red");

		// s.calculateArea();
		// c.calculateArea();

		// Colorful cf = new Colorful();

		Shape c = new Circle("red", 3.2);
		Circle d = new Circle("red", 3.2);
		d.method1();
		c.method1();

		d.calculateArea();
		c.calculateArea();

		Shape e = new Rectangle();

		System.out.println(c.calculateArea());
		System.out.println(e.calculateArea());

		Circle x = new Circle("black");
		Colorful y = x;

		printColor(x);

		Rectangle r = new Rectangle();
		printColor(r);
	}

	public void printColor(Colorful obj) {
		System.out.println(obj.getColor());
	}

	// public void printColor(Circle obj) {
	// System.out.println(obj.getColor());
	// }

	// public void printColor(Rectangle obj) {
	// System.out.println(obj.getColor());
	// }

}
