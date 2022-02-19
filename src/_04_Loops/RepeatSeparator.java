package _04_Loops;

import java.util.Scanner;

public class RepeatSeparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        scan.close();
        for(int i = 0; i < count-1; i++){
            System.out.print(word+separator);
        }
        System.out.print(word);

    }
}
/*Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

Example:

input:
Word
X
3
output: WordXWordXWord
input:
Word
X
3

output: WordXWordXWord
Example:

input:
This
And
2
output: ThisAndThis*/