class PaySlip {

	public double calculateExpendure(Employee e) {
		return e.calculateExpendure();
	}

	public double calculateExpendure(Employee e) {
		if (e instanceof Faculty) {
			Faculty f = (Faculty) e;
			return f.getSalary();
		} else if (e instanceof StaffMember) {
			StaffMember f = (StaffMember) e;
			// calc for staff member
			return f.getSalary() + f.getOvertime();
		} else if (e instanceof Contractor) {
			Contractor f = (Contractor) e;
			// calc for contractor
			return f.getHourRate();
		}
	}

	// public double calculateExpendure(Faculty f) {
	// return f.getSalary();
	// }

	// public double calculateExpendure(StaffMember f) {
	// return f.getSalary() + f.getOvertime();
	// }

	// public double calculateExpendure(Contractor f) {
	// return f.getHourRate();
	// }
}

// // caller
// calculateExpendure(new Faculty());
// calculateExpendure(new Contractor());
