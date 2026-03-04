public class DrawingApp {
	void main() {
		Shape s1 = new Shape("red");
		Circle s2 = new Circle("blue", 2.2);
		Rectangle s3 = new Rectangle();

		s1.displayColor();
		s2.displayColor();

		System.out.println(s1.calculateArea());
		System.out.println(s2.calculateArea());

	}
}
