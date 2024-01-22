package Tasks;

public class Assignment2
{
    public static void main(String[] args) {
        String sName = "John Doe";
        int age = 20;
        float height = 5.7f;
        char gender = 'M';
        String phoneNumber = "1234567890";
        String email = "john.doe@example.com";
        double gpa = 3.8;
        int grade = 12;
        String course = "NA";
        String address = "2424 ladley, springfield, IL- 62703";
        //To check both the values are equals or not
        int a=23;
        int b=45;

        if(a==b){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Not Equal");

        }

        int x = 55;
        int y = 70;
        if(x < 50 && x < y)
        {
            System.out.println("Both are true");
        }
        else
        {
            System.out.println("Both are false..!");
        }
        int marks1 = 90;
        int marks2 = 72;
        int marks3 = 36;
        int total = marks1 + marks2 + marks3;

        double percentage = ((double) total/300) * 100;

        System.out.println("Total marks are " + total + " and his percentage is " + percentage + "%.");

        //Ternary operator

        int agee = 20;
        String result = agee>18 ? "Eligible to vote" : "Not eligible for vote";
        System.out.println(result);

        System.out.println("Student Bio Data");
        System.out.println("Name: " + sName);
        System.out.println("Height: " + height);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Num: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade : " + grade);
        System.out.println("Course : " + course);
        System.out.println("Address : " + address);
    }
}
