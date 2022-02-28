package _05_Arrays;

import java.util.Scanner;

public class _2DArrayLargestNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        inp.close();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.nextInt();
            }//end for cols
        }//end for rows

        //TODO write your code below
        int maxNum = arr[0][0];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                maxNum = maxNum > arr[i][j] ? maxNum : arr[i][j];
            }
        }

        System.out.println("maxNum = " + maxNum);    
    }//end main
}
/*Find max num of 2dArray*/