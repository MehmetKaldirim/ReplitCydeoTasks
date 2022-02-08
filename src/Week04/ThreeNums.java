package Week04;
import java.util.Scanner;

public class ThreeNums {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        String bigger = n1 >= n2 && n1> n3 ? "n1" : n2 >= n1 && n2>= n3 ? "n2" : "n3";

        System.out.println( bigger + " is bigger");

    }
}
/*Write a program that checks for the biggest of 3 numbers.
you get 3 int variables: n1 , n2 and n3*/