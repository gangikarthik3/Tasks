package Tasks.src.Assignment5;

import java.util.Scanner;

public class DoubleToString {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Double to converted to String: ");
        double a = sc.nextDouble();
        String result = Double.toString(a);
        System.out.println("The string converted to float is: " +result);
    }
}
