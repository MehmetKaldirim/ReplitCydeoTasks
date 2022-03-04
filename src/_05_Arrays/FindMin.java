package _05_Arrays;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        // DO NOT TOUCH ABOVE
        //TODO: Write your code below.

        int min = nums[0];
        for (int num : nums) {
            min = num < min ? num : min;
        }
        System.out.println("max = " + min);
    }
}