package _03_String;

import java.util.Scanner;
import java.lang.String;

public class MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();
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

                System.out.println(word.substring(length / 2 - 1, length / 2 + 1));

            } else {
                System.out.println(word.repeat(2));
            }
        }


    }
}
/*You have a word, do the following:

When word has odd number of characters and:
3 or more characters, print middle letter
      oak ==> a
      oak ==> a
      javav ==> v
copied!
      javav ==> v
Single character, print that character 3 times
      # ==> ###
      # ==> ###
      q ==> qqq
      q ==> qqq
When word has even number of characters and:
4 or more characters, print the middle 2 characters
     java ==> av
     java ==> av
     apples ==> pl
     apples ==> pl
     #$%^&* ==> %^
     #$%^&* ==> %^
2 */