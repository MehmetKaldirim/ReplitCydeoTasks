package _05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstAndLast2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        //TODO: Write your code below
        String str ="";
        for(String word :  words){
            str += "" + word.charAt(0) + word.charAt(word.length()-1) + " " ;
        }
        str = str.substring(0,str.length()-1);
        System.out.println(Arrays.toString(str.split(" ")));
    }
}
/*Given a String array words, iterate through each word and print first and last
letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne] */