package Week05.String;
import java.util.Scanner;

public class FindLength {
    public static void main(String[] args) {
        //WRITER YOU CODE HERE
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the text:");
        System.out.println("Length is: " + sc.nextLine().length());
        sc.close();

    }
}
/*Write a program that will output length of the text (string).

Example:

Display message: "Please enter the text:"
Display message: "Please enter the text:"
input: java
input: java
Display message: "Length is: 4"*/