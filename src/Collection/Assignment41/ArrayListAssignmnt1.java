package Collection.Assignment41;

import java.util.ArrayList;

public class ArrayListAssignmnt1 {

	static public void minSalaryEmp(ArrayList<Employee> empInfoList) {
		int minIndex = 0;
		for (int index = 0; index < empInfoList.size(); index++) {
			if (empInfoList.get(index).salary < empInfoList.get(minIndex).salary) {
				minIndex = empInfoList.get(index).salary;
			}
		}
		System.out.println(empInfoList.get(minIndex));
	}

	public static void main(String[] args) {
		Employee empInfo1 = new Employee("Shreya", "karche", "patidar", 22, 3, "devlpment", 70000);
		Employee empInfo2 = new Employee("Manish", "mahajan", "patil", 42, 1, "product", 170000);
		Employee empInfo3 = new Employee("Monalika", "jain", "sarnt", 30, 2, "testing", 100000);

		ArrayList<Employee> empInfoList = new ArrayList<Employee>();
		empInfoList.add(empInfo1);
		empInfoList.add(empInfo2);
		empInfoList.add(empInfo3);
		
		minSalaryEmp(empInfoList);
		

	}

}
