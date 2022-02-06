package fourthWeek;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        if (number %2 == 0 ){
            System.out.println(number + " is even");
        } else if(number%2 != 0) {
            System.out.println(number + " is odd");
        } else if(number == 0) {
            System.out.println(number + " is even");
        } else return;
    }
}
/*Using conditional statements, check if number is odd or even.
Please follow the below examples and print message accordingly:*/
