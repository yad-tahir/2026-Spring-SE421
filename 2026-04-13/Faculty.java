public class Faculty implements HasId {

	private DefaultEmployee employee;

	public Faculty() {
		this.employee = new DefaultEmployee();
	}

	public int getId() {
		return employee.getId();
	}

	public void setId(int id) {
		employee.setId(id);
	}

}
