package _02_Statements;
import java.util.Scanner;
import java.lang.String;

public class ConditıonalStatementPractice3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        inp.close();
        //DO NOT CHANGE ABOVE CODE!  Write your code below
        //String output = name == "Chen"? "teacher" : "student"; //It s not true
        String output = name.equals("Chen")? "teacher" : "student"; //It s work in Replit
        System.out.println(output);
    }
}
/*The variable name holds a String user input

Write a conditional statement that will determine if the person is a student or teacher.

If name is equal to "Chen", print "teacher"
For any other input, print "student"
Examples:

input: Chen
output: teacher
input: Chen
output: teacher
input: Faa
output: student*/