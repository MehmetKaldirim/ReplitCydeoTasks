package _05_Arrays;

import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        // DO NOT TOUCH ABOVE
        //TODO: Write your code below.

        int sum = nums[0];
        for (int num : nums) {
            sum += num;
        }
        System.out.println("sum = " + sum);
    }
}