package _04_Loops;

import java.util.Scanner;

public class PrintNTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        //WRITE YOUR CODE HERE
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
//print asterix n times