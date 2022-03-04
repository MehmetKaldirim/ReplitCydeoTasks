package _05_Arrays;

import java.util.Scanner;

public class PrintShortestWord {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
        scan.close();
        int min = str[0].length();
        String result = "";
        for (String word : str) {
            if (word.length() <= min) {
                min = word.length();
                result = word;
            }
        }

        System.out.println(result);
    }


}
