package Week05.String;
import java.util.Scanner;

public class FindAUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Enter full name:");
        String name = scan.nextLine();
        scan.close();
        System.out.println(name.equalsIgnoreCase("Max Payne")
                || name.equalsIgnoreCase("Alan Wake") ? "User found!" : "User not found!");

    }
}
/*Write a program that will look up a user.

Assume that you have only 2 users: Max Payne and Alan Wake.
First, ask user to enter full name. Display message: "Enter full name:".
Then take input from user. If name is equals to either "Max Payne" or "Alan Wake",
display message: "User found!".
therwise, display message: "User not found!". Please make your search case insensitive!*/