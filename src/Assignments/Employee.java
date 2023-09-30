package Assignments;

//Program : 1
//Create Employee class and parameterized constructor with attributes empId , empName, years of Experience and salary. 
//Write a method to display the details of employees. 
//Create a method isEligible which will return true if Employee salary is more than 30000. 
//Create a method isSwitchRequired, which will return true if yearsOfExperience * 200000 < salary.

public class Employee {
	int EmpID;
	String EmpName;
	int yop;
	double salary;

	Employee(int EmpID, String EmpName, int yop, double salary) {
		this.EmpID = EmpID;
		this.EmpName = EmpName;
		this.yop = yop;
		this.salary = salary;
	}

	boolean isEligible() {
		if (salary > 30000)
			return true;
		else
			return false;
	}

	boolean isSwitchRequired() {
		if ((yop * 200000) /12 < salary)
			return true;
		else
			return false;
	}

	void display() {
		System.out
				.println(EmpName + "'s empid " + EmpID + " and year of experience " + yop + " and salary is " + salary);
	}

	public static void main(String[] args) {
		Employee employee = new Employee(10163633, "Monalika", 8, 150000);
		employee.display();
		System.out.println(employee.isEligible());
		System.out.println(employee.isSwitchRequired());

	}

}

