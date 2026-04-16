public class App {
	public void main() {

		Faculty f = new Faculty();
		f.setId(200);
		f.getId();

		HasId id = new HasId() {
			public int getId() {
				return 0;
			}

			public void setId(int id) {
			}
		};
		Faculty f2 = new Faculty(id);
		f2.setId(200);
		f.getId(); // zero!

	}

}
