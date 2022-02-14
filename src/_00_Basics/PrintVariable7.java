package _00_Basics;
import java.util.Scanner;

public class PrintVariable7 {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan = new Scanner(System.in);
        String topic1 = scan.nextLine();
        String topic2 = scan.nextLine();

        //WRITE YOUR CODE BELOW THIS LINE:

        System.out.printf("I will learn \"%s\" and \"%s\" at CybertekSchool.", topic1, topic2);
    }
}
/*Assume topic1 = "Java" and topic2 = "SQL"

You need to print exactly:

I will learn "Java" and "SQL" at CybertekSchool.*/
