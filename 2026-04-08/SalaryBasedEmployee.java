public abstract class SalaryBasedEmployee extends Employee {

	private float salary;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		if (salary < 0) {
			throw new RuntimeException("Salary cannot be smaller than zero");
		}
		this.salary = salary;
	}
}
