package Week03;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1, num2, num3;
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("Sum of numbers: " + sum);

    }
}
/*-Display prompt "Enter 3 numbers:"

-Using scanner object let user input 3 numbers

-Add 3 numbers and assign to sum variable

-Print "Sum of numbers: ValueOfSum"*/