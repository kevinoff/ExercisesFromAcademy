package uk.ac.belfastmet.examples;

public class Student {

	private String name;
	private int age;
	
	public static int noOfStudents;
	
	public static int getNumberOfStudents() {
		return noOfStudents;
	}
	
	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		noOfStudents++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
