package fourthWeek;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        //ENTER CODE HERE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cent = scan.nextInt();

        if (cent >= 0 && cent <= 100){

            int quarter = cent / 25;
            int dimes = (cent % 25) / 10;
            int nickels = ((cent % 25) % 10) /5;
            int pennies =  cent % 5 ;
            System.out.println("Your change is "+quarter+" quarters, "+dimes+" dimes, " + nickels + " nickels, and "+ pennies + " pennies");
        } else {
            System.out.println("Invalid cents amount");
        }


    }
}
/*Write a program that will determine the change given from the vending machine. The program will accept the cents amount and output the change in quarters, dimes, nickels, and pennies.

The given cents value should be more than 0 and less than 100. If the given cents is not in the range print "Invalid cents amount" and there should be no other output after
In valid cases print the change in this format: Your change is x quarters, x dimes, x nickels, and x pennies

Enter cents:
95
Your change is 3 quarters, 2 dimes, 0 nickels, and 0 pennies*/
