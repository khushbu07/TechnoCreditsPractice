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
		//return (this.salary-empDetails.salary);
		//return (this.empName-empDetails.empName);
		//return (this.empid-empDetails.empid);
		return -1;
	}
	
	
	public String toString(){
		return this.empName+" - "+this.salary;
	}

}
