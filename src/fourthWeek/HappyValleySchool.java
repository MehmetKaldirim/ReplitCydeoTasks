package fourthWeek;
import java.util.Scanner;
public class HappyValleySchool {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();
        input.close();
        String result ="";

        if (age >= 2 && age <=18) {
            if (age == 2){
                result = "toddler";
            } else if(age >= 3 && age <= 5) {
                result = "early childhood";
            } else if(age >= 6 && age <= 7) {
                result = "young reader";
            } else if(age >= 8 && age <= 10) {
                result = "elementary";
            } else if(age >= 11 && age <= 12) {
                result = "middle";
            } else if(age == 13) {
                result = "impossible";
            } else if(age >= 14 && age <= 16) {
                result = "high school";
            } else {
                result = "schoolar";
            }
        } else {
            result = "ineligible";
        }
        System.out.println( result);
    }
}

/*In the Happy Valley School System, children are classified by age as follows:

Assume only positive numbers are given

less than 2, ineligible
2, toddler
3-5, early childhood
6-7, young reader
8-10, elementary
11 and 12, middle
13, impossible
14-16, high school
17-18, scholar
greater than 18, ineligible
less than 2, ineligible
2, toddler
3-5, early childhood
6-7, young reader
8-10, elementary
11 and 12, middle
13, impossible
14-16, high school
17-18, scholar
greater than 18, ineligible
Given age print out the category the student would fall under

Example:

Enter age:
8

elementary*/
