package _04_Loops;

import java.util.Scanner;

public class CatsAndDogs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();


        countOfCats = countElement(word, "cat");
        countOfDogs = countElement(word, "dog");
        System.out.println(countOfCats == countOfDogs);
    }


    private static int countElement(String word, String elmnt) {
        int counter = 0;
        int fromIndex =0;
        while (word.indexOf(elmnt, fromIndex) != -1 ) {

            fromIndex = word.indexOf(elmnt, fromIndex);
            counter++;
            fromIndex++;
        }
        return counter;
    }
}
/*Print true if the string "cat" and "dog" appear the same number of times in the given string word.

Example:

input: catdog
output: true
input: catdog
output: true
Example:

input: catcat
output: false
input: catcat
output: false
Example:

input: cat-cheetah-dog-cat
output: false*/