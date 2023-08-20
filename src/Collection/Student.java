package Collection;

public class Student {
	 //this is pojo class
	private int stuRno;
	private String stuName;
	
	Student(int stuRno,String stuName ){
		this.stuRno=stuRno;
		this.stuName=stuName;
		}
	
	public int getStuRno(){
		return stuRno;
	}
	public String getStuName(){
		return stuName;
	}
	public String toString(){
		return stuRno+" : "+stuName;
	}
}
