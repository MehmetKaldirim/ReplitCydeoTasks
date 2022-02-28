package _05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Printing_01 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone!  write your code below.
        //Create another loop for your solution!
        for (String s : arr) {
            System.out.println(s.substring(0,3));
        }

        //answer with lambda expression
        Arrays.stream(arr).forEach(word -> System.out.println(word.substring(0,3)));


    }
}
/*The code provided in your main method will take in five Strings and save them into an array
called arr. Print out the first three letter of each element on seperate lines. You can
assume that every element of arr is at least 3 letters long.

Example:
arr -> ["hello", "how", "are", "you", "doing"]

Output:
hel
how
are
you
doing*/