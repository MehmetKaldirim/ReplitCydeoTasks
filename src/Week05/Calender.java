package Week05;
import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        // DO NOT CHANGE
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter month number:");
        int monthNum = scan.nextInt();

        //WRITE YOUR CODE HERE:
        boolean boundaryCheck = monthNum >= 1 && monthNum <= 12;


        if (boundaryCheck) {
            switch (monthNum) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("Fabruary");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("Agust");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
            }

        } else {
            System.out.println("Invalid month number");
        }
    }
}
/*Write a program that will print out month names by receiving a number. Use Switch Statement. If an invalid month number is entered print "Invalid month number"

Example:

Display message: "Enter month number:"

input: 5

Display message: "May"*/