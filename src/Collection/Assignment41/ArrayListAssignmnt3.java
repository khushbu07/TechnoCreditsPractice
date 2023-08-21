package Collection.Assignment41;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAssignmnt3 {
//	Program 3:
//		return a list of employee name whose age is less than 30 and salary is greater than 75000.
//		Hint : List<String> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, double salary, int age){}
	
	String fName;
	String lName;
	String surName;
	int age;
	int empId;
	String empDeptName;
	int salary;
	
	static List<Employee> filterEmployeeByAgeAndSalary(List<Employee> listOfEmployee, int salary, int age){
		List<Employee> filterAgeAndSalary=new ArrayList<Employee>();
		for(int index=0;index<listOfEmployee.size();index++){
			if(listOfEmployee.get(index).age<30 && listOfEmployee.get(index).salary>75000){
				filterAgeAndSalary.add(listOfEmployee.get(index));
			}
		}
	
		
		
		return filterAgeAndSalary;
	}

	
	public static void main(String[] args) {
		Employee empInfo1 = new Employee("Shreya", "karche", "patidar", 22, 3, "devlpment", 80000);
		Employee empInfo2 = new Employee("Manish", "mahajan", "patil", 42, 1, "product", 129000);
		Employee empInfo3 = new Employee("Monalika", "jain", "sarnt", 29, 2, "testing", 213000);

		List<Employee> empInfoList = new ArrayList<Employee>();
		empInfoList.add(empInfo1);
		empInfoList.add(empInfo2);
		empInfoList.add(empInfo3);
		
		System.out.println("List of employee name whose age is less than 30 and salary is greater than 75000");
		
		
		List<Employee> filterList=filterEmployeeByAgeAndSalary(empInfoList, 75000, 30);
		
		for(Employee e:filterList){
			System.out.println(e+"\n");
		}
		

	}

}
