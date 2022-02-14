package _02_Statements;
import java.util.Scanner;
public class Citizens {
    public static void main(String[] args) {
        int age, senior, nonSenior;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        senior = sc.nextInt();
        nonSenior = sc.nextInt();
        System.out.println("What is new citizen's age?");
        age = sc.nextInt();
        if (age >= 65) {
            senior++;
            System.out.println("Senior Citizen");
        } else {
            nonSenior++;
            System.out.println("Non-Senior Citizen");
        }
        System.out.println("New seniorCitizens count " + senior);
        System.out.println("New nonSeniorCitizens count " + nonSenior);

    }
}
/*Declare int variables: seniorCitizens, nonSeniorCitizens, age
Create a Scanner object
Ask user to enter count for seniorCitizens and nonSeniorCitizens using message:

"Enter current count for seniorCitizens and nonSeniorCitizens:"

Ask user to enter age:

"What is new citizen's age?"

if citizen's age is more than or equals to 65 then print "Senior Citizen" and increment seniorCitizens variable by 1.

if citizen's age is less than 65 then print "Non-Senior Citizen" and increment nonSeniorCitizens variable by 1.

Last print another message:

"New seniorCitizens count ValueOfVariable"

"New nonSeniorCitizens count ValueOfVariable"

Example:

Enter current count for seniorCitizens and nonSeniorCitizens:
5
4
What is new citizen's age?
66
Senior Citizen
New seniorCitizens count 6
New nonSeniorCitizens count 4*/
