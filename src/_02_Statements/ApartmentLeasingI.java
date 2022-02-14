package _02_Statements;
import java.util.Scanner;

public class ApartmentLeasingI {
    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");

        int numberOfBedrooms = scan.nextInt();
        int startingPrice = 0;
        scan.close();
        //WRITE YOUR CODE HERE:
        switch(numberOfBedrooms){
            case 1:
                System.out.println("One Bedroom Selected");
                startingPrice = 1100;
                System.out.println("Starting Price: " +startingPrice);
                break;
            case 2:
                System.out.println("Two Bedroom Selected");
                startingPrice = 1850;
                System.out.println("Starting Price: " +startingPrice);
                break;
            case 3:
                System.out.println("Three Bedroom Selected");
                startingPrice = 2550;
                System.out.println("Starting Price: " +startingPrice);
                break;
            default:
                System.out.println("No such Bedrooms available");
        }
    }
}
/*Write program for Leasing office.

numberOfBedrooms variable already declared and assigned value using Scanner:

startingPrice is set to 0.

prices 1 bedroom - 1100 2 bedroom - 1850 3 bedroom - 2550

Example Flow:

Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
1
One Bedroom Selected
Starting Price: 1100
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
1
One Bedroom Selected
Starting Price: 1100
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
3
Three Bedroom Selected
Starting Price: 2550
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
3
Three Bedroom Selected
Starting Price: 2550
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
5
No such Bedrooms available
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
5
No such Bedrooms available
Note: If an invalid bedroom number is given no price is displayed*/