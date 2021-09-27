import java.util.Scanner;
import java.lang.Math;

public class WhitchProblem
{
    //h1. Finding the sum on fibonaci numbers as required
    // Function to return the nth Fibonacci number
    static int fib(int n)
    {
        double phi = (1 + Math.sqrt(5)) / 2;
        return (int)Math.round(Math.pow(phi, n) / Math.sqrt(5));
    }

    // Function to return the required sum
    static int calculateSum( int r)
    {
        // To store the sum
        int sum = 0;

        // Calculate the sum
        for (int i = 1; i <= r; i++)
            sum += fib(i);

        return sum;
    }

    //step 2 finding the number of person dead on each ear of birth.
    static double avarage(double aged, double yeard)
    {
        if(aged < 0)
            return -1;
        else
        if(aged > yeard)
        {
            double c = aged - yeard;
            return c;
        }
        else
        return -1;
    }

    //step 3. calculating the avarage of those two people.
    static void persons(double a, double b)
    {
        double c = (a+b)/2;
        System.out.print(c);
    }

    //step 4 futting all together in the main class
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Give the age and death for the first Person.");
        double ageA = in.nextInt();
        double deathA = in.nextInt();

        double avarageA = avarage(ageA,deathA);
        System.out.print("The avarage of first Person is: ");
        System.out.println(avarageA);
        double first  = calculateSum((int) avarageA);

        System.out.println("Give the age and death for the Second Person.");
        double ageB = in.nextInt();
        double deathB = in.nextInt();

        double avarageB = avarage(ageB,deathB);
        System.out.print("The avarage of second Person is: ");
        System.out.println(avarageB);
        double second =  calculateSum((int) avarageB);

        System.out.println("Avarage of both is");
        persons(first, second);

    }
}