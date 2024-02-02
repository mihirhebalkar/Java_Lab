class Student {
	String name;
	int prn;
	
}

class SecondYear extends Student {
	int noofsubjects;
	String elective;
	
	void displaySecondYear() {
		System.out.println("SecondYear");
		System.out.println("Name : "+ name);
		System.out.println("PRN : "+ prn);
		System.out.println("Noofsubjecsts : "+ noofsubjects);
		System.out.println("Elective : "+ elective);
		System.out.println();
	}
}

class ThirdYear extends Student {
	int noofsubjects;
	String specialization;
	
	void displayThirdYear() {
		System.out.println("ThirdYear");
		System.out.println("Name : "+ name);
		System.out.println("PRN : "+ prn);
		System.out.println("Noofsubjecsts : "+ noofsubjects);
		System.out.println("specialization : " + specialization);
		System.out.println();
	}
}



public class HierarchialInheritance {
	
	public static void main(String[] args) {
		SecondYear sy = new SecondYear();
		ThirdYear ty = new ThirdYear();
		
		sy.name = "Mihir";
		sy.prn = 120;
		sy.noofsubjects = 5;
		sy.elective = "German";
		sy.displaySecondYear();
		
		ty.name = "Dhairya";
		ty.prn = 118;
		ty.noofsubjects = 7;
		ty.specialization = "Devops";
		ty.displayThirdYear();	
	}
}
