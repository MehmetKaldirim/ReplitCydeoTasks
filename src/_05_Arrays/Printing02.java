package _05_Arrays;

import java.util.Scanner;

public class Printing02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];

        String result = "";
        for (int i =0; i < 8 ; i++){
            arr[i] = input.nextLine();
            if (i% 2 == 0) {
                System.out.print(arr[i]+ ", ");
            } else {
                System.out.println(arr[i]);
            }
        }
        input.close();
    }
}
/*The code provided in your main method will take in eight Strings and save them into
 an array arr.

Print out the 4 lines using for loop: each line should contain a pair of array elements

Example:

arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"]
arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"]
Output:
apple, banana
kiwi, grape
milk, soda
juice, coffee*/