package Week05;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();
        s.close();
        //your code here (check equalıty of two words)

        System.out.println(word1.equals(word2) ? "word1 equals word2": "word1 does not equal word2");
    }
}

