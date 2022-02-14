package _03_String;
import java.util.Scanner;


public class MergeThem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        scan.close();
        //YOUR CODE HERE
        String mergWord = "";
        if (word1.length() == word2.length()){
            for (int i =0; i < word1.length();i++) {
                mergWord += word1.charAt(i) + "" + word2.charAt(i);
            }

        } else {
            mergWord = "cannot merge";
        }

        System.out.println(mergWord);

    }
}

