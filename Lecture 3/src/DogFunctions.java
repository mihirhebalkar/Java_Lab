public class DogFunctions {

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Before Getter and Setter");

        // Use the setter methods without printing their results
        dog.setName("Tommy");
        dog.setAge(10);

        System.out.println("After Getter and Setter");
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        dog.dogBarks();
    }
}

class Dog {
    private String name;
    private int age;

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

    public void dogBarks() {
        System.out.println(this.name + " is barking.");
    }
}


