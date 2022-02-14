package _02_Statements;
import java.util.Scanner;

public class FindMidNumber {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner sc = new  Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Enter second number:");
        num2 = sc.nextInt();
        System.out.println("Enter third number:");
        num3 = sc.nextInt();
        sc.close();
        int md = num1 < num2 && num1> num3 || num1 < num3 && num1> num2 ? num1 :
                num2 < num1 && num2> num3 || num2 < num3 && num2> num1 ? num2 :
                        num3;

        System.out.printf("Medium value is: %d",md);
    }
}
/*Write a program that will return mid number out of three numbers.
No need to do any calculations.

Create an object of Scanner class.

Declare int 3 variables: num1, num2, num3.*/