package Week05;
import java.util.Scanner;

public class BurgerOrChicken {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();
        s.close();

        //your code here
        double price = 0.0;

        switch(in) {

            case "burger" : case "chicken" :
                price = 10.0;
                break;

            case "soda" :
                price = 2.0;
                break;

            case "fries" :
                price = 3.5;
                break;

        }

        System.out.println(price);
    }
}