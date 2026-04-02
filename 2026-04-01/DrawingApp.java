public class DrawingApp {
	void main() {

		Circle x = new Circle("black");
		printColor(x);

		Rectangle r = new Rectangle();
		printColor(r);

		Colorful c = new Colorful() {
			public String getColor() {
				return "Blue";
			}

			public void setColor(String color) {
				// nothing
			}
		};

		c.setColor("Red");
		printColor(c);
	}

	public void printColor(Colorful obj) {
		System.out.println(obj.getColor());
	}

}
