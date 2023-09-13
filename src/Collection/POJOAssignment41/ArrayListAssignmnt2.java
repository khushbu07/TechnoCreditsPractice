package Collection.POJOAssignment41;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAssignmnt2 {
	
//	Program 2:
//		Return a list of employee whose salary is less than 30000.
//		Hint : List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee){}

	static public List<Employee> filterEmployeeBySalary(List<Employee> listOfEmployee){
		List<Employee> filteredList=new ArrayList<Employee>();
		for(int index=0;index<listOfEmployee.size();index++){
			if(listOfEmployee.get(index).salary<30000){
				filteredList.add(listOfEmployee.get(index));
			}
		}
		return filteredList;
		
	}
	public static void main(String[] args) {
		Employee empInfo1 = new Employee("Shreya", "karche", "patidar", 22, 3, "devlpment", 70000);
		Employee empInfo2 = new Employee("Manish", "mahajan", "patil", 42, 1, "product", 29000);
		Employee empInfo3 = new Employee("Monalika", "jain", "sarnt", 30, 2, "testing", 23000);

		List<Employee> empInfoList = new ArrayList<Employee>();
		empInfoList.add(empInfo1);
		empInfoList.add(empInfo2);
		empInfoList.add(empInfo3);
		
		System.out.println("Employees with salary less than 30000");
		List<Employee> filterList=filterEmployeeBySalary(empInfoList);
		for(Employee emp:filterList ){
			System.out.println(emp+"\n ");
			
		}
		

	}

}
