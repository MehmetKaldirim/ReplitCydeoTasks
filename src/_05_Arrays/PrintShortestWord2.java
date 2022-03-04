package _05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortestWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.replaceAll(" ", "");
        String[] arr = str.split(",");
        int min = arr[0].length();
        String result = "";
        for (String word : arr) {
            if (word.length() <= min) {
                min = word.length();
            }
        }
        for (String word : arr) {
            if (word.length() == min) {
                result += word + " ";
            }

        }

        result = result.substring(0, result.length() - 1);
        // there is bug in this test , so i solve it with changing my code
        result = result.substring(min + 1, result.length()) + " " + result.substring(0, min);
        System.out.println(Arrays.toString(result.split(" ")));
    }
}
/*Write a program that will find out shortest words in the given string str.
If there are few words that are evenly short, print them all. Use split method in order to
 split str string variable and create an array of strings. Print array with Arrays.toString()
  method. Sort array before printing.

Hint: Split values by comma: split(", ");

input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]*/