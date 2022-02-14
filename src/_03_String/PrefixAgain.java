package _03_String;

import java.util.Scanner;

public class PrefixAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        System.out.println(str.indexOf(str.substring(0,n)) ==
                str.lastIndexOf(str.substring(0,n)) ? false : true);

    }
}
/*Given a String str and a number n check if the prefix (made of up of the first n characters) appears in the remaining part of the String. Print true or false.

Assume that the String is not empty and that n is in the range from 1 to str.length().

Examples:

input: abXYabc
input: 1
output: true
input: abXYabc
input: 1

output: true
input: abXYabc
input: 2
output: true
input: abXYabc
input: 2

output: true
input: abXYabc
input: 3
output: false*/
