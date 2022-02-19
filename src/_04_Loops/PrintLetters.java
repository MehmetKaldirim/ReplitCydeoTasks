package _04_Loops;

import java.util.Scanner;

public class PrintLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        char start = a.charAt(0);
        char end = b.charAt(0);
        scan.close();
        for(char i = start; i <= end; i++){
            System.out.print(i);
        }
    }
}
/*Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.

Example:

input:
A
Z
​
output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
input:
A
Z

output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
Example:

input:
a
f

output: abcdef*/