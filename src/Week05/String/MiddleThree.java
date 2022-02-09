package Week05.String;

import java.util.Scanner;

public class MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();
        //YOUR CODE HERE
        int length = word.length();
        String result = length < 5 || length %2 ==0 ? "invalid" : word.substring(length/2 -1, length/2+2);
        System.out.println(result);

    }
}
/*Given a String variable word print the middle three characters
 if the word is an odd number of characters and has more than 5 characters.
 If the word does not meet the requirements print invalid.*/
