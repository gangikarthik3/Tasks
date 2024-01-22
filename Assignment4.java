package Tasks;

class Animal {
    String species;
    String sound;

    public Animal(String species, String sound) {
        this.species = species;
        this.sound = sound;
    }

    public void makeSound()
    {
        System.out.println("The " + species + " makes a " + sound + " sound.");
    }
}

class Car
{
    String make;
    String model;
    int year;

    public Car(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println(year + " " + make + " " + model);
    }
}

class Person
{
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + "-year-old " + gender + ".");
    }
}

class Employee
{
    String name;
    String jobTitle;
    int age;
    double salary;

    public Employee(String name, String jobTitle, int age, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println(name + " works as a " + jobTitle + " and age is " + age + " and earns " + salary + " per year.");
    }
}

public class Assignment4 {
    public static void main(String[] args) {

        Animal dog = new Animal("Dog", "Bark");
        Car myCar = new Car("Toyota", "Camry", 2022);
        Person person = new Person("Roy", 50, "Male");
        Employee employee = new Employee("Maxi", "Software Dev", 35, 125000);

        // Using methods of the objects
        dog.makeSound();
        myCar.displayInfo();
        person.introduce();
        employee.displayInfo();
    }
}

