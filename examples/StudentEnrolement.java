package uk.ac.belfastmet.examples;

public class StudentEnrolement {
		
	public static void main(String[] args) {
		
		Student studentObj1 = new Student("Kevin", 26);
		Student studentObj2 = new Student("KevinTwo", 23);
		Student studentObj3 = new Student("KevinThree", 21);
		
		System.out.println(Student.getNumberOfStudents());
	}

}
