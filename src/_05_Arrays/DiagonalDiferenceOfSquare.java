package _05_Arrays;

import java.util.Scanner;

public class DiagonalDiferenceOfSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
        scan.close();
        int result;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int firstDiagonal = 0;
        int secondDiagonal = 0;


        for(int i=0 ;i<=rows-1;i++){
            for(int j=0 ;j<=cols-1;j++){
            firstDiagonal = i == j ? firstDiagonal + matrix[i][j] : firstDiagonal;
            secondDiagonal = i+j == rows-1 ? secondDiagonal + matrix[i][j] : secondDiagonal;
            }//end for cols
        }//end for rows

        result = firstDiagonal-secondDiagonal;




        // FINAL PRINT
        System.out.println(Math.abs(result));
    }
}
