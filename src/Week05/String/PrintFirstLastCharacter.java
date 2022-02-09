package Week05.String;

import java.util.Scanner;

public class PrintFirstLastCharacter {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        //WRITE YOUR CODE HERE:
        System.out.println("first char: " + word.charAt(0));
        System.out.println("first char: " + word.charAt(word.length()-1));
        System.out.println("first and last char: " + word.charAt(0)+ word.charAt(word.length()-1));
    }
}

/*Write a program that will print out the first character of the word.*/