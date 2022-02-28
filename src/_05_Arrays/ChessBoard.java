package _05_Arrays;

import java.util.*;


public class ChessBoard {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE
        for (int i = 0; i < 8; i++) {
            for (char j = 0, c = 'a'; j < 8; j++, c++) {
               chessBoard[i][j] = ""+ (i+1) + c ;
            }
        }
            //DO NOT CHANGE
            System.out.println(Arrays.deepToString(chessBoard));
    }
}
/*Given a 8x8 two-dimensional array of strings named chessboard. Initialize values inside an
 array accordingly to the chess board. So first element in the array, chessboard[0] should
  have a value "1a", and last element in the array, chessboard[7] should have a value "8h".*/