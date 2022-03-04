package _05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyCertainValues {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = {scan.next(), scan.next(), scan.next(), scan.next(), scan.next()};
        System.out.println(Arrays.toString(getWithE(arr)));
        scan.close();

    }


    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
        //StringBuilder words = new StringBuilder();
        String words = "";
        String str;
        for (String word : arr) {
            if (word.contains("e")) {
                words += word + " ";
            }
        }
        //str = words.substring(0,words.length()-1);

        String fewValues[] = words.split(" ");

        //YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }

}

    /*Finish the getWithE. Given a String array arr with the following elements

["zero", "one", "two","three","four"]

Create another array fewValues and copy words that have letter e in them

You need to know how many element contain e and create array accordingly

Values in fewValues array need to be ["zero", "one","three"]

Examples:

arr -> ["aa", "be", "lol", "lel", "oreo"]

fewValues -> ["be",  "lel", "oreo"]
arr -> ["aa", "be", "lol", "lel", "oreo"]

fewValues -> ["be",  "lel", "oreo"]
arr -> ["e", "hey", "bye", "fury", "spoon"]

fewValues ->["e", "hey", "bye"] */