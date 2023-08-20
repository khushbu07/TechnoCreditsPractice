package Collection;

import java.util.ArrayList;

public class ArrayListEx {

	static public void printStudentName(ArrayList<Student> studentInfo) {
		for (int index = 0; index < studentInfo.size(); index++) {
			System.out.println(studentInfo.get(index).getStuName());

		}

	}

	static public void printStudentRno(ArrayList<Student> studentInfo) {
		for (int index = 0; index < studentInfo.size(); index++) {
			System.out.println(studentInfo.get(index).getStuRno());

		}
	}

	static public int printMaxRno(ArrayList<Student> studentInfo) {
		int maxRnoIndex = 0;
         for (int index = 0; index < studentInfo.size(); index++) {
          if (studentInfo.get(maxRnoIndex).getStuRno() > maxRnoIndex) {
				maxRnoIndex = index;
			}
		}
		return maxRnoIndex;
	}

	public static void main(String[] args) {

		ArrayList<Student> studentInfo = new ArrayList<Student>();
		// studentInfo.add(1);
		// studentInfo.add("Prasad1");
		//
		// studentInfo.add(2);
		// studentInfo.add("Prasad2");
		//
		// studentInfo.add(3);
		// studentInfo.add("Prasad3");

		Student student1 = new Student(1, "Mona1");
		Student student2 = new Student(2, "Mona2");
		Student student3 = new Student(3, "Mona3");

		studentInfo.add(student1);
		studentInfo.add(student3);
		studentInfo.add(student2);

		// for (int index = 0; index < studentInfo.size(); index++) {
		// Student s1 = studentInfo.get(index);
		// // System.out.println(s1.getStuRno()+" : "+s1.getstuName());
		// System.out.println(studentInfo.get(index).getStuRno());
		// }

		printStudentName(studentInfo);
		printStudentRno(studentInfo);
		System.out.println("==============================");
		int index=printMaxRno(studentInfo);
		System.out.println(index);
		Student info=studentInfo.get(index);
		System.out.println(info);
	}

}
