package _03_String;

import java.util.Scanner;

public class GetSandwich {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int firstIndex = str.indexOf("bread");
        int lastIndex = str.lastIndexOf("bread");

        System.out.println(firstIndex == lastIndex ? "nothing" : str.substring(firstIndex + 5, lastIndex));
    }
}
/*A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.

Example:

input: breadjambread
output: jam
input: breadjambread

output: jam
input: xxbreadjambreadyy
output: jam
input: xxbreadjambreadyy

output: jam
input: xxbreadapple
output: nothing
input: xxbreadapple

output: nothing
input: breadbutterbread
output: butter*/