package _05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertDecimalToBinary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];
        for (int i = 7; i >= 0; i--) {
           binary[i] = decimal % 2;
           decimal /= 2;
        }
        System.out.println(Arrays.toString(binary));
    }
}
/*A Binary number is a number expressed in the base-2 numeral system or binary numeral system,
 which uses only two symbols: 0 (zero) and 1 (one). Each digit is referred to as a bit.

Given an int variable decimal, write java program to calculate binary value of the decimal
 variable and assign it to a binary array. Print out value of binary array matching below
 format. Feel free to use additional arrays or formulas.

Example:

decimal -> 3
binary -> [0, 0, 0, 0, 0, 0, 1, 1]
decimal -> 3

binary -> [0, 0, 0, 0, 0, 0, 1, 1]
decimal -> 35
binary -> [0, 0, 1, 0, 0, 0, 1, 1]
decimal -> 35

binary -> [0, 0, 1, 0, 0, 0, 1, 1]
decimal -> 255
binary -> [1, 1, 1, 1, 1, 1, 1, 1]*/