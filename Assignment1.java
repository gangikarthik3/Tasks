package Tasks;

public class Assignment1
{
    public static void main(String[] args)
    {
        int resultA = -5 + 8 * 6;
        int resultB = (55 + 9) % 9;
        int resultC = 20 + -3 * 5 / 8;
        int resultD = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println("Expected Output:");
        System.out.println("A: " + resultA);
        System.out.println("B: " + resultB);
        System.out.println("C: " + resultC);
        System.out.println("D: " + resultD);

        String arr[] = {"John", "Jade", "Love", "Allen","Midhun","kartik","raj"};

        System.out.println("All names:");
        for(String name: arr) {
            System.out.println(name);
        }
        System.out.println("\nfirst name: " +arr[0]);
        System.out.println("\nlast name: " +arr[arr.length-1]);
    }

}


