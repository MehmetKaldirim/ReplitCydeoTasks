package _04_Loops;

import java.util.Scanner;

public class Factorial {
    static int result;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println(factorial(n));

    }
    public static int factorial(int n)
    {
        if (n == 0)
            return 1;
        else
            result = n * factorial(n-1);
        return result;
    }
}
/*In mathematics a factorial of a positive integer n, denoted by n!, is the product of all positive integers less than or equal to n. Calculate factorial and output result to the console.

Example:

input: 5
output: 120
5 * 4 * 3 * 2 * 1*/