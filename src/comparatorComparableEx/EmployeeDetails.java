package comparatorComparableEx;

public class EmployeeDetails implements Comparable<EmployeeDetails> {
	
	private int empid;
	private String empName;
	private int salary;
	
	public EmployeeDetails(int empid,String empName,int salary){
		this.empid=empid;
		this.empName=empName;
		this.salary=salary;
	}

	@Override
	public int compareTo(EmployeeDetails empDetails) {
		return (this.salary-empDetails.salary);
		//return this.empName.compareTo(empDetails.empName); //String k case me compareTo method use krna pdegi
		//return (this.empid-empDetails.empid);
		
	}
	
	
	public String toString(){
		return this.empName+" - "+this.salary;
	}

}
