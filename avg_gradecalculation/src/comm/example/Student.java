package comm.example;

public class Student {

	private int id;
	private String name;
	private int [] marks;
	private float average;
	private char grade;
	public Student() {
		super();
	}
	public Student(int id, String name, int[] marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int[] getMarks() {
		return marks;
	}
	protected void setMarks(int[] marks) {
		this.marks = marks;
	}
	protected float getAverage() {
		return average;
	}
	protected void setAverage(float average) {
		this.average = average;
	}
	protected char getGrade() {
		return grade;
	}
	protected void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void calculateAvg()
	{
		float num = 0.0f;
		for(int a=0;a<this.getMarks().length;a++)
		{
			num = num + this.marks[a];
		}
		this.setAverage(num/getMarks().length);
		
		
	}
	public void findGrade()
	{
		int min = this.marks[0];
		for(int b=0; b<this.getMarks().length;b++)
		{
			if(this.marks[b]<min)
			{
				min = this.marks[b];
			}
		}
		if(min<50)
		{
			this.setGrade('F');
		}
		else if(this.getAverage()>=80 && this.getAverage()<=100)
		{
			this.setGrade('O');
		}
		else
		{
			this.setGrade('A');
		}
	}
	
	
}
