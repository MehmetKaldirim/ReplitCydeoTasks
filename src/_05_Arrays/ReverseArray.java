package _05_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        input.close();
        for(int i = 0, j = nums.length-1; i < nums.length; i++, j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            if (i == j){
                break;
            }
        }


        //Do not change below statement:
        System.out.println(Arrays.toString(nums));

    }
}

/*Given an array nums with 7 integers already assigned,
write code to reverse it. Dont use aditional array and String*/