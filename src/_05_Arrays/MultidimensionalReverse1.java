package _05_Arrays;

import java.util.Arrays;

public class MultidimensionalReverse1 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int[][] arr2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}, {100, 110, 120}};

// Combining arr1 and arr2
        int[][][] arr3D = {arr1, arr2};

// To see what arr3D looks like
        System.out.println(Arrays.deepToString(arr3D));
        System.out.println("-------------------------------------------------------");

/*
Created to have a reversed array,
I had to specify 4 and 3 as the sizes of the inner arrays, because otherwise
the reverse array would be = [null, null], and thus it was giving me NullPointerException error
when I was trying to assign anything. Maybe there is a better solution where you don't need to hardcode it,
but this is what I could come up with.
 */
        int[][][] reversed = new int[arr3D.length][4][3];

// You can see it's all zeros, thus overridable and won't cause the problem mentioned above.
        System.out.println(Arrays.deepToString(reversed));

// a. b. c is to be used for looping through arr3D in reverse order,
// d, e, f is to be used with reversed, so that we can have a
// sorted array in descending order.
        int d = 0, e = 0, f = 0;
        for (int a = arr3D.length - 1; a >= 0; a--) {
            for (int b = arr3D[a].length - 1; b >= 0; b--) {
                for (int c = arr3D[a][b].length - 1; c >= 0; c--) {
                    reversed[d][e][f++] = arr3D[a][b][c]; // Increase the f so that we can assign through every item in [][]['here'].
                }
                // Increase e, and reset f since we will be looping through the next order of e
                f = 0;
                e++;
            }
            // Increase d, and reset e since we will be looping through the next order of d
            e = 0;
            d++;
        }

        System.out.println("-----------------------RESULT----------------------------");
        System.out.println(Arrays.deepToString(reversed));
    }
}
