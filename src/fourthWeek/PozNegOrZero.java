package fourthWeek;
import java.util.Scanner;

public class PozNegOrZero {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();


        if (num > 0 ){
            System.out.println("positive");
        } else if(num < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
