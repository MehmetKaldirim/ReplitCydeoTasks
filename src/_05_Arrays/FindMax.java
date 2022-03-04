package _05_Arrays;

import java.util.Scanner;
import java.util.*;

public class FindMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        // DO NOT TOUCH ABOVE
        //TODO: Write your code below.

        int max = nums[0];
        for (int num : nums) {
            max = num > max ? num : max;
        }
        System.out.println("max = " + max);
    }
}

