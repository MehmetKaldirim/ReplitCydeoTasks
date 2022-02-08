package Week04;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int max = a >= b ? a : b;
        System.out.println(max + " is greater");
    }
}
/*a=1
b=2

output:
2 is greater*/