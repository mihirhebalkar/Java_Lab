package My_first_project;
public class Person {
    // Class variables
    private static int numberOfPeople = 0;

    // Instance variables
    private String name;
    private int age;
    private String occupation;

    // Constructor
    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        numberOfPeople++;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    // Class method to get the number of people
    public static int getNumberOfPeople() {
        return numberOfPeople;
    }

    // Method to print person details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating instances of the Person class
        Person person1 = new Person("John Doe", 25, "Engineer");
        Person person2 = new Person("Jane Smith", 30, "Teacher");
        Person person3 = new Person("Bob Johnson", 22, "Student");

        // Printing details of each person
        System.out.println("Details of Person 1:");
        person1.printDetails();

        System.out.println("Details of Person 2:");
        person2.printDetails();

        System.out.println("Details of Person 3:");
        person3.printDetails();

        // Printing the total number of people
        System.out.println("Total number of people: " + Person.getNumberOfPeople());
    }
}
