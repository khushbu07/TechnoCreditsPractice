package Collection.Assignment41;


//Program 1:
//Print all the details of employee having minimum salary.
//-> Employee class fields : firstName, lastName, surnName, age, empId, empDeptId, empDeptName, salary.
//-> override toString method in Employee class.
public class Employee {
	String fName;
	String lName;
	String surName;
	int age;
	int empId;
	String empDeptName;
	int salary;
	
	Employee(String fName,String lName,String surName,int age,int empId,String empDeptName,int salary){
		
		this.fName=fName;
		this.lName=lName;
		this.surName=surName;
		this.age=age;
		this.empId=empId;
		this.empDeptName=empDeptName;
		this.salary=salary;
	}


	public String toString(){
		 return "First Name: "+fName+"\nLastName: "+lName+"\nAge: "+age+"\nEmpId: "+empId+"\nEmpDeptId: "+empId+"\nSalary: "+salary+"\nEmpDeptName: "+empDeptName;
	}
	

}
