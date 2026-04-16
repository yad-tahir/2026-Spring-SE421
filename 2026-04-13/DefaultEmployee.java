public class DefaultEmployee implements HasId, HasName {
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

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		if (name == null) {
			throw new RuntimeException("Name cannot be null");
		}
		this.fullName = name;
	}
}
