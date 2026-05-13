public class Student {
	private final int id;
	private final float gpa;
	private final Department dept;

	public Student() {
		this.id = 0;
		this.gpa = 0f;
	}

	public Student(int id, float gpa) {
		this.id = id;
		this.gpa = gpa;
	}

	public int getId() {
		return id;
	}

	public float getGpa() {
		return gpa;
	}

	// public void reset(){
	// this.id = 0;
	// this.gpa = -1f;
	// }

	// public void setId(int id) {
	// this.id = id;
	// }

	// public void setGpa(float gpa) {
	// this.gpa = gpa;
	// }

	public Student setId(int id) {
		Student result = new Student(id, this.gpa);
		return result;
	}

	public Student setGpa(float gpa) {
		Student result = new Student(this.id, gpa);
		return result;
	}
}
