package Week02;
import java.util.Scanner;

public class PrintVariable6 {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        String p1 = "James";
        String p2 = "Jill";
        String p3 = "Bob";
        String p4 = "Betty";
        String p5 = "Herb";
        //WRITE YOUR CODE BELOW THIS LINE:
        String cs = ", ";
        String all = p3 + cs + p2 + cs + p4 + cs + p5 + cs + p1;
        System.out.println(all);

    }
}

/*5 String variables are already declared to stored their names.

James doesn't want to sit next to Jill
Betty and Herb are dating and want to sit next to each other
Bob wants to sit on an left side aisle
James wants to sit on the aisle
Provide a seating order that conforms to the above rules.
 An example of an invalid seating order is:
 James, Betty, Herb, Bob, Jill (it is false)*/