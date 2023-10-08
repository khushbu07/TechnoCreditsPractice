package comparatorComparableEx.comparatorDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Admin {

	public static void main(String[] args) {

   Student stu1=new Student("Student1",1,5,44,'C');
   Student stu2=new Student("Student2",2,6,42,'A');
   Student stu3=new Student("Student3",3,7,23,'D');
   Student stu4=new Student("Student4",4,8,88,'B');
   
   ArrayList<Student> arraylistObj=new ArrayList<Student>();
   
   arraylistObj.add(stu1);
   arraylistObj.add(stu2);
   arraylistObj.add(stu3);
   arraylistObj.add(stu4);
   
  // Collections.sort(arraylistObj,new StudentMarksComparator());
   Collections.sort(arraylistObj,new StudentGradeComparator());
   System.out.println(arraylistObj);
   

	}

}
