package Week05;
import java.util.Scanner;
public class VehicleRecall {
    public static void main(String[] args) {
        // DO NOT CHANGE:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int y = input.nextInt();
        input.close();

        //WRITE YOUR CODE HERE:
        boolean recalYear = (1995 <= y && y <= 1998) ||
                (2001 <= y && y <= 2002) ||
                (2004 <= y && y <= 2006) ||
                (2015 <= y && y <= 2017);
        System.out.println(recalYear ? "Your vehicle needs to be recalled!" : "Your vehicle is fine, enjoy!");


    }
}
/*SDET Motors Inc. is recalling all vehicles from model years 1995-1998, 2001-2002, 2004-2006 and 2015-2017.

In this assignment you will write a program that will find vehicle for recall.

If the year is in the provided range print: Your vehicle needs to be recalled!

If the year is fine print: Your vehicle is fine, enjoy!

Example:

Enter vehicle's year:
1996

Your vehicle needs to be recalled!
Enter vehicle's year:
1996

Your vehicle needs to be recalled!
Enter vehicle's year:
2018
Your vehicle is fine, enjoy!*/
