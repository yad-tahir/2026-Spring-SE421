public class Faculty implements HasId {

	private HasId strategy;

	public Faculty() {
		this.strategy = new DefaultEmployee();
	}

	public Faculty(HasId strategy) {
		// injection
		this.strategy = strategy;
	}

	public int getId() {
		return strategy.getId();
	}

	public void setId(int id) {
		strategy.setId(id);
	}

}
