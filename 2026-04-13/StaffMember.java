public class StaffMember extends SalaryBasedEmployee {
	public double calculateExpendure() {
		return this.getSalary() + this.getOvertime();
	}
}
