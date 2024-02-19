import java.util.ArrayList;

public class Student {
	
	int id;
	String name;
	char grade;
	
	//using constructor to initialise
	public Student(int id, String name, char grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public void displayStudents(ArrayList<Student> listOfStudents) {
		System.out.println("Name\tID\tGrade");
		for (Student s : listOfStudents) {
			System.out.println(s.name +"\t"+ s.id +"\t"+ s.grade);
		}
	}
	
	public void addStudents(Student s, ArrayList<Student> listOfStudents) {
		listOfStudents.add(s);
	}
	
	
		
	public static void main(String[] args) {
		ArrayList<Student> listOfStudents = new ArrayList<>();
		
		Student s1 = new Student(120,"Mihir",'A');
		Student s2 = new Student(1898,"John",'C');
		Student s3 = new Student(120,"Doe",'D');
		
		listOfStudents.add(s1);
		listOfStudents.add(s2);
		listOfStudents.add(s3);
		
		
		
		s1.displayStudents(listOfStudents);

	}
}
