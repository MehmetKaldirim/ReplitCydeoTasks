package _05_Arrays;

import java.util.Scanner;

public class Printing03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = input.nextLine();
        }
        // DO NOT TOUCH ABOVE
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (j < 2) {
                    System.out.print(arr[i + j] + ", ");
                } else  {
                    System.out.print(arr[i + j]);
                }
            }
            System.out.println();

        }
        input.close();
    }
}



/*The code provided in your main method will take in six Strings and save them into
an array arr.

Print out the 3 neighboring items of the array in one line until the last line each line
 should contain 3 neighboring items of array element as displayed below

Example:

arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda"]

Output:
apple, banana, kiwi
banana, kiwi, grape
kiwi, grape, milk
grape, milk, soda*/
