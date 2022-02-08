package Week04;
import java.util.Scanner;

public class IfStatementGrade {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);

        int grade = s.nextInt();

        //Write your code here:
        boolean boundaryChack = grade >= 0 && grade <= 100;

        boolean a = grade >= 90;
        boolean b = grade >= 70;
        boolean c = grade >= 60;
        boolean d = grade < 60;


        if (boundaryChack) {
            if (a) { //if the student made an A
                System.out.println("excellent");
            } else if (b) { // if the student made a B
                System.out.println("good");
            } else if (c) { // if the student made a C
                System.out.println("pass");
            } else if (d) { // if the student made a D
                System.out.println("fail");
            } else { return;
            }

        } else {
            System.out.println("Invalid Note");
        }

    }
}
