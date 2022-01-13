package listExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class StudentArrayList {

	public static void main(String[] args) {
		// Generics declaration of array list
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "mayur"));
		students.add(new Student(2, "Akshay"));
		students.add(new Student(3, "Pankaj"));
		students.add(new Student(4, "raju"));
		students.add(new Student(5, "rahul"));
		students.add(new Student(6, "raina"));
		students.add(new Student(7, "allu"));
		students.add(new Student(8, "kashi"));
		students.add(new Student(9, "kirti"));
		
		
		
		System.out.println(students);
		for (Student result : students) {
			
			System.out.println(result.getStudentId());
			System.out.println(result.getStudentName());
			System.out.println("==========================");
			System.out.println(students.get(0));
			System.out.println(students.toString());
			System.out.println(students.get(0).getClass().getName());
			}
		
		HashSet<Integer> integers = new HashSet<>();
		integers.add(123);
		integers.add(456);
		integers.add(789);
		integers.add(159);
		integers.add(123);
		System.out.println(integers+"hashset ========");
		

		for(Integer result : integers){
				System.out.println("Hash set iterating using for loop =="+result);
										}

		
		Iterator<Integer> iterators = integers.iterator();
		while (iterators.hasNext()) {
			
			System.out.println(iterators.next()+"   Hash set iterating using iterator");
		
			
		}
	}
	
	
	
	

}
