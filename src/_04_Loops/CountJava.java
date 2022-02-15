package _04_Loops;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        scan.close();
        int countOfJava = countElement(word, "java");
        System.out.println(countOfJava);
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

// count java in string