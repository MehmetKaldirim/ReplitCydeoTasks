package Week05;

import java.util.Scanner;

public class ReverseIt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();
        //WRITE YOUR CODE HERE
        String result = "";
        if (word.length() < 5) {
            result = "Too short!";
        } else if (word.length() > 5) {
            result = "Too long!";
        } else {
            for (int i = 4; i >= 0; i--) {
               result += word.charAt(i);
            }
        }
        System.out.println(result);

    }
}
/* reverse only five character string*/
