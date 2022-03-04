package _05_Arrays;



import _02_Statements.nums;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPeace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] n = new int[size];
        for(int i =0; i < size; i++) {
            n[i] = scan.nextInt();
        }
        scan.close();
        //WRITE YOUR CODE HERE
        if (n.length < 2) {
            System.out.println (Arrays.toString(n));
        } else {
            int b[] = Arrays.copyOfRange(n, 0, 2);
            System.out.println (Arrays.toString(b));
        }


    }
}