public abstract class Shape implements Colorful {
	protected String color;

	public Shape(String color) {
		this.color = color;
	}

	public void displayColor() {
		System.out.println("This shape is " + color + ".");
	}

	public abstract double calculateArea();

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
