package thirdWeek;
import java.util.Scanner;

public class SchoolGrade {
    public static void main(String[] args) {
        // Enter your code here

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String subject1 = scan.next();
        double score1 =scan.nextDouble();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String subject2 = scan.next();
        double score2 =scan.nextDouble();
        System.out.println("Please enter subject name number 3 and score for this subject");
        String subject3 = scan.next();
        double score3 =scan.nextDouble();
        System.out.println("Please enter subject name number 4 and score for this subject");
        String subject4 = scan.next();
        double score4 =scan.nextDouble();
        System.out.println("Please enter subject name number 5 and score for this subject");
        String subject5 = scan.next();
        double score5 =scan.nextDouble();
        double average = (score1 + score2 + score3 +score4 + score5) / 5;
        System.out.printf("Summary: %s - %.1f, %s - %.1f, %s - %.1f, %s - %.1f, %s - %.1f\n",subject1,score1,subject2,score2,subject3,score3,subject4,score4,subject5,score5);
        System.out.printf("Your average score is: %.1f\n",average);
        System.out.println("Thank you for using Grader!\nGoodbye!");
    }
}
/*Write the program that will calculate the average grade. Use 5 String variables and 6 double variables to hold the subject and the grade value. Build a summary with all the information by concatenating the subjects and grades. Then calculate the average grade and print display the average score too.

Execution flow with example:

Welcome to the Grader!
Please enter subject name number 1 and score for this subject
Math
5.0
Please enter subject name number 2 and score for this subject
Biology
4.2
Please enter subject name number 3 and score for this subject
English
4.4
Please enter subject name number 4 and score for this subject
Chemistry
4.8
Please enter subject name number 5 and score for this subject
Music
3.4
​
Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8, Music - 3.4
Your average score is: 4.36
Thank you for using Grader!
Goodbye!*/