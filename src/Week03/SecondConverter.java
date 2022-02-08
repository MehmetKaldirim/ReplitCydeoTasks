package Week03;
import java.util.Scanner;
public class SecondConverter {
    public static void main(String[] args) {
        //YOUR CODE HERE:
        Scanner scan = new Scanner(System.in);

        int inputSeconds,hours,minutes,seconds;
        System.out.println("Enter seconds:");
        inputSeconds = scan.nextInt();
        hours = inputSeconds / 3600;
        minutes = (inputSeconds % 3600) / 60 ;
        seconds = inputSeconds % 60;
        System.out.printf("%d hours, %d minutes, and %d seconds", hours,minutes,seconds);
    }
}
/*Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds*/