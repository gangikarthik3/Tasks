package Tasks.src.Assignment5;
import java.util.Scanner;
public class StringToFloat {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to converted to Float: ");
        String a = sc.next();
        Float result = Float.parseFloat(a);
        System.out.println("The string converted to float is: " +result);
    }
}
