public class Employee {
	private int id;
	private String fullName;
	private float salary;

	public Employee(int id) {
		this.setId(id);
	}

	public int getId() {
		if (id == 0) {
			return -1;
		}
		return id;
	}

	public String getName() {
		return fullName;
	}

	public float getSalary() {
		return salary;
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

	public void setSalary(float salary) {
		if (salary < 0) {
			throw new RuntimeException("Salary cannot be smaller than zero");
		}
		this.salary = salary;
	}
}
