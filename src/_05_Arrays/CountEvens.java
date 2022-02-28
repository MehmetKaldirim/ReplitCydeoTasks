package _05_Arrays;

import java.util.Scanner;

public class CountEvens {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO: Write your code below
        input.close();
        int evenNoCount = 0;
        for (int s : nums) {
            evenNoCount = s % 2 == 0 ? evenNoCount + 1 : evenNoCount;
        }
        System.out.println(evenNoCount);
    }

    //Given an array nums, count and print the number of even numbers in the array
}

