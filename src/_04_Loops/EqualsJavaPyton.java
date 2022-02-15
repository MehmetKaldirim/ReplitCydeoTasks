package _04_Loops;

import java.util.Scanner;

public class EqualsJavaPyton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        scan.close();

        int countOfJavas = countElement(sentence, "java");
        int countOfPythons = countElement(sentence, "python");
        System.out.println(countOfJavas == countOfPythons);
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
