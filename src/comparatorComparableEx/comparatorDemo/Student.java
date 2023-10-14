package comparatorComparableEx.comparatorDemo;

public class Student {
	
	
	//jb multiple attribute pr comparison chaiye hota h to comparator use krna hota h
	
	String name;
	int rno;
	int standard;
	int marks;
	char grade;
	
	public Student(String name, int rno, int standard, int marks, char grade) {
		super();
		this.name = name;
		this.rno = rno;
		this.standard = standard;
		this.marks = marks;
		this.grade = grade;
	}
	
	
	public String toString(){
		return this.name+"-"+marks+"-"+grade;
	}

}
