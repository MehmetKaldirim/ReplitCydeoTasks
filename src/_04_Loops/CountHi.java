package _04_Loops;

import java.util.Scanner;

public class CountHi {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int countOfHi;
        String word = scan.next();
        String writeHi = scan.next();
        scan.close();
        countOfHi = countElement(word,writeHi);
        System.out.println(countOfHi);
    }


    private static int countElement(String word, String elmnt) {
        int counter = 0;
        int fromIndex =0;
        while (word.indexOf(elmnt, fromIndex) != -1 ) {

            fromIndex = word.indexOf(elmnt, fromIndex);
            counter++;
            fromIndex++;
        }
        return counter;
    }
}
//coun word hi or java  inside string