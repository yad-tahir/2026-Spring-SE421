public abstract class Employee {
	private int id;
	private String fullName;

	public int getId() {
		if (id == 0) {
			return -1;
		}
		return id;
	}

	public String getName() {
		return fullName;
	}

	private void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		if (name == null) {
			throw new RuntimeException("Name cannot be null");
		}
		this.fullName = name;
	}

	public abstract double calculateExpendure();

}
