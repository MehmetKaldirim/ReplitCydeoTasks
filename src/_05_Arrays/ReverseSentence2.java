package _05_Arrays;

import java.util.Scanner;

public class ReverseSentence2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed ="";
        //TODO: start your code here
        String arr[] = sentence.split(" ");

        for( String word : arr){
            reversed = " " + word + reversed;
        }
        reversed = reversed.substring(1,reversed.length());


        //End your code here. do not modify below statement
        System.out.println(reversed);

    }
}
/*Given a String variable sentence, write code to get each word and assign to String
 reversed in reverse order.

Example:

sentence -> Java is fun
reversed > fun is Java*/