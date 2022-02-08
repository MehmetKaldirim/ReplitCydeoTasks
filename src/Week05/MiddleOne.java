package Week05;

import java.util.Scanner;
import java.lang.String;

public class MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //YOUR CODE HERE
        int length = word.length();
        if (length % 2 != 0) {

            if (length >= 3) {
                System.out.println(word.charAt(length / 2));
            } else {
                System.out.println(word.repeat(3));
            }


        } else {

            if (length >= 4) {
                int beginIndex = (length / 2) - 1;
                int endIndex = (length / 2) + 1;
                System.out.println(word.substring(length / 2 - 1, length / 2 + 1));

            } else {
                System.out.println(word.repeat(2));
            }
        }


    }
}
