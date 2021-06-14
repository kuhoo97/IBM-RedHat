package comm.example;

public class Student {

	private int studentId;
	private String studentName;
	private double GPA;
	public Student() {
		super();
	}
	public Student(int studentId, String studentName, double gPA) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		GPA = gPA;
	}
	protected int getStudentId() {
		return studentId;
	}
	protected void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	protected String getStudentName() {
		return studentName;
	}
	protected void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	protected double getGPA() {
		return GPA;
	}
	protected void setGPA(double gPA) {
		GPA = gPA;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", GPA=" + GPA + "]";
	}
	
	
	
}

