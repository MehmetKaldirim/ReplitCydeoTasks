package _05_Arrays;

import java.util.Arrays;

public class MultiDimensionalReverse {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3,4}, {5, 6}, {7, 8, 9}, {10, 11, 12,14,15},{16,17,18,19,20}};
        int[][] arr2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90,100}};
        int[][] arr3 = {{110, 120, 130}, {140, 150, 160}, {170, 180, 190}, {200}};
        int[][][] arr3D = new int[3][][];
        arr3D[0] = arr1;
        arr3D[1] = arr2;
        arr3D[2] = arr3;
        int[][][]  reversed3D = new int[arr3D.length][][];

        for (int i = arr3D.length - 1, a = 0; i >= 0; i--,a++) {
            reversed3D[a] = getReverse2D(arr3D[i]);

        }

        System.out.println("first tour= "+Arrays.deepToString(reversed3D));
    }

    public static int[][] getReverse2D(int[][] array) {
        int[][] reversed = new int[array.length][];
        for (int i = 0; i < array.length; i++) {
            int[] temp = array[array.length - i - 1];
            reversed[i] = new int[temp.length];
            for (int j = 0; j < temp.length; j++) {
                reversed[i][j] = temp[temp.length - j - 1];
            }
        }


        return reversed;
    }
}
// reverse of multidimensional array