package Tasks;

import java.util.Scanner;
public class Assignment3 {
    //program that reads a number in inches and converts it to meters.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;
        double square;
        double cube;
        double fourth;
        System.out.println("Enter a value in inches to convert into meters: ");
        double inch = sc.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");

        //program that reads a number and displays the square, cube, and fourth power

        System.out.println("Enter a number for a square, cube and fourth power: ");
        num = sc.nextDouble();
        square = num * num;
        cube = square * num;
        fourth = cube * num;

        System.out.printf("\nSquare is : %.2f\n", square);
        System.out.printf("Cube is : %.2f\n",cube);
        System.out.printf("Fourth Power of number is : %.2f\n", fourth);

		/*program that accepts four integers from the user and prints equal if all four are equal,
		and not equal otherwise. */

        System.out.print("Input first number: ");
        int num1 =sc.nextInt();
        System.out.print("Input second number: ");
        int num2 = sc.nextInt();
        System.out.print("Input third number: ");
        int num3 = sc.nextInt();
        System.out.print("Input fourth number: ");
        int num4 = sc.nextInt();

        if (num1 == num2 && num2 == num3 && num3 == num4)
        {
            System.out.println("Numbers are equal.");
        }
        else
        {
            System.out.println("Numbers are not equal!");
        }

        //program to read an integer and check if the given number is even or odd
        int num5 = 4;

        // Checking if number is even or odd number
        // via remainder
        if (num5 % 2 == 0) {
            System.out.println("Entered Number is Even");
        }

        else
        {
            System.out.println("Entered Number is Odd");
        }
    }
}
