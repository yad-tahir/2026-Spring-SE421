public class Shape {
	private String color;

	public Shape(String color) {
		this.color = color;
	}

	public void displayColor() {
		System.out.println("This shape is " + color + ".");
	}

	public double calculateArea() {
		System.err.println("Area calculation not defined for a generic shape.");
		return 0.0;
	}
}
