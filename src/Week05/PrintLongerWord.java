package Week05;

import java.util.Scanner;

public class PrintLongerWord {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        scan.close();
        //WIRTE YOUR CODE HERE
        System.out.println(word1.length() > word2.length() ? word1 : word2);


    }
}

/*Write a program that will print out the longest word.
Note: Assume the length of the two given Strings will be different

input:
bill
check
input:
bill
check
output: check*/
