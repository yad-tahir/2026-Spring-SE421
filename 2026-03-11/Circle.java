public class Circle extends Shape {

	private final double radius;

	public Circle(String color) {
		super(color);
		radius = 0;
	}

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	public void method1() {
		System.out.println("Method 1 is called");
	}
}
