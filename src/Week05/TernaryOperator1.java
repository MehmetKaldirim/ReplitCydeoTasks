package Week05;
import java.util.Scanner;

public class TernaryOperator1 {
    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();
        //WRITE YOUT CODE HERE:

        x = x >= 5 ? x : -x;
        System.out.println(x);

    }
}
/*Write an expression using the conditional operator (? :)
that compares the value of the variable x to 5 and results in:
Display x if x is greater than or equal to 5 Display -x if x is less than 5
DO NOT USE IF STATEMENT or SWITCH CASE*/