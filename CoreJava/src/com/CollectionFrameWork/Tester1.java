package com.CollectionFrameWork;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Spliterator;

//Student.java
class Student {
	private String name;
	private int id;

	// Constructor
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	// For printing
	@Override
	public String toString() {
		return "Student{name='" + name + "', id=" + id + "}";
	}
}

public class Tester1 {
	public static void main(String[] args) {
		Student s1 = new Student("Alice", 101);
		Student s2 = new Student("Bob", 102);
		Student s3 = new Student("Charlie", 103);
		Student s4 = new Student("David", 104);
		Student s5 = new Student("Eve", 105);
		
		ArrayList<Student> st=new ArrayList<Student>();
		
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);
		
			st.removeIf((an)->{
				 if(an.getId()>103)
				 {
					 return true;
				 }
				 return false;
						});
			
			ListIterator<Student> li = st.listIterator();
			while(li.hasNext())
			{
				li.next();
			}
			while(li.hasPrevious())
			{
				System.out.println(li.previous());
			}
			
			System.out.println("==========SPlitIterator===========");
			Spliterator<Student> sp = st.spliterator();
			sp.forEachRemaining(System.out::println);
			System.out.println("==========SPlitIterator trysplit()===========");

			Spliterator<Student> trySplit = sp.trySplit();
			trySplit.forEachRemaining(System.out::println);

			
	}

}
