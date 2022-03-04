package _05_Arrays;

import java.util.Scanner;

public class FindMaxLengthStringInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }
        String langest = words[0];
        int max = words[0].length();
        for (String word :words) {
            langest = word.length() > max ? word : langest;

        }
        System.out.println("langest = " + langest);
    }
}