package _05_Arrays;

import java.util.Scanner;
import java.util.*;

public class FindNonDublicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt(), input.nextInt()};
        input.close();

        //TODO: write your code below
        int length = nums.length;
        int lonely;
        int frequency;
        for (int i = 0; i < length ; i++) {
            lonely = nums[i];
            frequency = 0;
            for (int j = 0; j < length; j++) {
                if( lonely == nums[j]) frequency++;
            }
            if (frequency == 1)
            System.out.println(lonely);
        }

    }
}
/*Given an array nums with 7 integers every element is
repeated twice - except one. Find that element and print it to console.*/