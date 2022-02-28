package _05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstLastChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below
        for (String s : words) {
            System.out.println(""+ s.charAt(0)+s.charAt(s.length()-1));
        }

        //answer with lambda expression
        Arrays.stream(words).forEach(s ->  System.out.println( "" + s.charAt(0)+s.charAt(s.length()-1)));
    }
}
/*Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]

print:
ho
wy
by
ae
ne*/

