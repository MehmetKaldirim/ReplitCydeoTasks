package _04_Loops;

import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below
        inp.close();
        word = word.toLowerCase();
        String vowelStr ="";
        char vowels;

        for(int i = 0 ; i <= word.length()-1;i++ ){
            vowels = word.charAt(i);
            System.out.println(vowels);
            switch (vowels) {
                case 'a' :case 'e' :case 'i' :case 'o' :case 'u' :
                    vowelStr += vowels;
                    break;


            }

        }

        System.out.println(vowelStr);

    }
}
/*Create a program that will take the given String In and print out all the vowels
from the String.

Example:

Input: howdyho
Output: oo
Input: howdyho

Output: oo
Input: huehuehuehue
Output: ueueueue*/