package Tasks.src.Assignment5;
import java.util.Scanner;

public class IntegerToString {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Integer: ");
        int a= sc.nextInt();
        String result = String.valueOf(a);
        System.out.println(result);

        //String to Integer
        System.out.println("Enter a String to convert to Integer: ");
        String b = sc.next();
        int x = Integer.parseInt(b);
        System.out.println("String to integer: " +x);
    }
}
