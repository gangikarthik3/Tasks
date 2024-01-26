package Tasks.src.Assignment6;

public class Person {
        String pName;
        int pAge;

        public Person(String name, int age)
        {
            this.pName = name;
            this.pAge = age;
        }
        public static void main(String args[])
        {
            Person p = new Person("Roy", 28);
            System.out.println("Person Name : "+ p.pName + "," + p.pAge  );
            Person p1 = new Person("Singham", 35);
            System.out.println("Person Name : "+ p1.pName + "," + p1.pAge  );
        }
}
